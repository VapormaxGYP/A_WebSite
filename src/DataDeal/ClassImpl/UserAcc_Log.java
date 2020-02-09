package DataDeal.ClassImpl;

import Entity.User_ID_PW;
import Tools.JDBCtools;

import java.sql.*;

public class UserAcc_Log implements DataDeal.UserAcc_Log {

    @Override
    public User_ID_PW login(int userID, String passWord) {

        Connection connection = JDBCtools.getConnection();

        String sql = "select * from UserAccount where userID = ? and Password = ?";
        PreparedStatement statement = null;
        ResultSet resultset = null;
        User_ID_PW users = null;

        try {
                statement = connection.prepareStatement(sql);
                statement.setInt(1,userID);
                statement.setString(2,passWord);
                resultset = statement.executeQuery();

                if(resultset.next()){

                    int ID = resultset.getInt(1);
                    String Pw = resultset.getString(2);
                    users = new User_ID_PW(ID,Pw);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCtools.releaseAll(connection,statement,resultset);
        }

        return users;
    }
}
