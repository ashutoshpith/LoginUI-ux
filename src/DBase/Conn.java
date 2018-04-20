package DBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
   public void isConnected() {
        String url = "jdbc:mysql://localhost:3306";
        String user = "root";
        String pass = "root";
        Connection connection;

        {
            try {
                connection = DriverManager.getConnection(url, user, pass);
                System.out.println("Connected");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Not connected");
            }
        }

    }
    public static void main(String [] args){
        Conn c=new Conn();
        c.isConnected();
    }

}
