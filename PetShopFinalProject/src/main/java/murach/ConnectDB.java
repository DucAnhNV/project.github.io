package murach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection getConnection() throws SQLException {
        Connection conn = null;


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

             //assign from environment variable
            String url ="jdbc:mysql://localhost:3306/petshop";
            String user = "root";
            String password ="@Nh321810495";

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
