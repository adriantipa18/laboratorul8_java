package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *a class that deals with the connection to the database, opens a connection, and closes that connection.
 */
public class Database {


    public static Connection connect(String url, String user, String password) throws SQLException, ClassNotFoundException {
        Connection con;
        Class.forName("oracle.jdbc.driver.OracleDriver");

        con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", "student", "student");

        return con;
    }

    public static void endConnection(Connection con) throws SQLException {
        con.close();
    }

}
