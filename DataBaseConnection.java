import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
        } catch (SQLException throwables) {
            throw new RuntimeException("Something went wrong during database connection");
        }
    }
}
