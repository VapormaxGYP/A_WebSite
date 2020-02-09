package Tools;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.sun.source.tree.StatementTree;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCtools {

    private static DataSource dataSource = new ComboPooledDataSource("mysql");

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void releaseAll(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (resultSet != null) {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void releaseCS(Connection connection, Statement statement)
    {
        try {
            if(connection != null)
            {
                connection.close();
            }
            if(statement != null)
            {
                statement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
