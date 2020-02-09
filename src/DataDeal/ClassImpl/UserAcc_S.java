package DataDeal.ClassImpl;

import Tools.JDBCtools;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserAcc_S implements DataDeal.UserAcc_S {

    @Override
    public void Signup(int userID, String passWord, int EPC_Code) {

        Connection connection = JDBCtools.getConnection();

        String sql = "insert into UserAccount (UserID, Password, EPC_Code) values (?, ?, ?)";

        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement(sql);

            statement.setInt(1,userID);
            statement.setString(2,passWord);
            statement.setInt(3,EPC_Code);

            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCtools.releaseCS(connection,statement);
        }
    }
}
