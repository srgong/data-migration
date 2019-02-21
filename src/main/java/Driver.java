import client.PsqlClient;
import model.Orders;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.NotDirectoryException;

import com.fasterxml.jackson.databind.ObjectMapper;

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

    public static void checkInputFiles(File f) throws FileNotFoundException {
        if(!f.exists()) throw new FileNotFoundException();
        if(f.isDirectory()) throw new FileNotFoundException();
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
            checkInputDir(new File(inputDir));
            PsqlClient client = new PsqlClient(db_host);

            File input = new File(inputDir);
            client.createOrdersTable();

            Orders orders = objectMapper.readValue(input, Orders.class);
            client.insert(orders);

            System.out.println(orders);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

}
