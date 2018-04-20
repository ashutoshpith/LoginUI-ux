package DBase;

import java.sql.*;

public class InteractDb {

    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

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


        public void showUserProfile() throws SQLException {
        String info="";
        String sql="SELECT * FROM login.users WHERE info=?";
        preparedStatement=connection.prepareStatement(sql);
        preparedStatement.setString(3,info);



        }



        }
