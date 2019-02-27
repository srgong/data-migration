import client.PsqlClient;
import model.LineItems;
import model.Metrics;
import model.Orders;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NotDirectoryException;

import com.fasterxml.jackson.databind.ObjectMapper;
import processing.Transform;

/**
 * Created by Sharon on 2/20/19.
 */
public class Driver {
    /**
     * checks inputs exist and is a file
     * @param f
     * @throws FileNotFoundException
     */
    public static void checkInputDir(File f) throws NotDirectoryException {
        if(!f.isDirectory()) throw new NotDirectoryException("This is not a directory");
    }

    public static void main(String args[]) {
        if(args.length != 2) {
            System.err.println("Usage:\n    " +
                    "java Driver.java <input_dir> <psql_host>");
            System.exit(1);
        }

        String inputDir = args[0];
        String db_host = args[1];

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File input = new File(inputDir);
            checkInputDir(input);

            PsqlClient client = new PsqlClient(db_host);
            client.createOrdersTable();
            client.createLineItemsTable();
            client.createMetricsTable();

            // serialize json to object & build orders table
            Orders orders = objectMapper.readValue(input, Orders.class);
            client.insertOrders(orders);

            // extract line items from orders & build line items table with added orders_id
            LineItems lineItems = Transform.extractLineItems(orders.getOrders());
            client.insertLineItems(lineItems);

            // gather metrics on orders and lineitems (view of all customers and the products/quantity of items they purchased)
            // build metrics table
            Metrics metrics = Transform.getMetrics(orders, lineItems);
            client.insertMetrics(metrics);

            client.closeConnection();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
