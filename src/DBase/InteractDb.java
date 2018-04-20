package DBase;

import java.sql.*;

public class InteractDb {

    public Connection connection = null;
    public PreparedStatement preparedStatement = null;
    public ResultSet resultSet = null;

    String id="";
    String pass="";
    String info="";

    public InteractDb() {
        try {
            connection = Conn.isConnected();


        } catch (Exception e) {
            System.out.println(e);
        }

    }

        public boolean isDatabaseConnected(){
            return this.connection!=null;
        }

        public boolean isLogin(String id, String pass) throws SQLException {
        this.id=id;
        this.pass=pass;
            String sql = "SELECT * FROM login.users WHERE id =? and pass=?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,id);
            preparedStatement.setString(2,pass);
            resultSet=preparedStatement.executeQuery();
                    if (resultSet.next()){
                        return true;
                    }else
                    {
                        return false;
                    }

        }






        }
