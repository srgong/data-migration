package client;

import model.Orders;
import sql.Query;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sharon on 2/21/19.
 */
public class PsqlClient {
    static Connection c;

    public PsqlClient(String db_host) {
        c = getConnection(db_host);
    }

    public boolean createOrdersTable() {
        try {
            Statement s = c.createStatement();
            String query = Query.createTable();
            s.execute(query);
            s.close();
        } catch(java.sql.SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean insert(Orders orders) {
        try {
            Statement s = c.createStatement();
            String query = Query.insert(orders);
            System.out.println(query);
//            s.execute(query);
            s.close();
        } catch(java.sql.SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * returns db Connection if successful
     * @throws IOException
     */
    public static Connection getConnection(String db_host) {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://"+db_host+":5432/testdb",
                            "postgres", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
        return c;
    }

    public static void closeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException s) {
            s.printStackTrace();
        }
    }
}
