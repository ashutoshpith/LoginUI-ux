package DBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
   static String url = "jdbc:mysql://localhost:3306";
   static String user = "root";
   static String pass = "root";

   public static Connection isConnected() throws SQLException {
       return DriverManager.getConnection(url,user,pass);




    }



}
