import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseAuthService implements AuthService {

   public BaseAuthService() {
       try {
           Class.forName("com.mysql.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       Connection connection = DataBaseConnection.getConnection();
       System.out.println("Database of users is connected");

       // Заполняю таблицу в базе данных
       try {
           connection.setAutoCommit(false);
           PreparedStatement statement1 = connection.prepareStatement("INSERT INTO users (nickname, login, password) VALUES (?, ?, ?)");
           statement1.setString(1, "nick1");
           statement1.setString(2, "login1");
           statement1.setString(3, "pass1");
           statement1.execute();

           PreparedStatement statement2 = connection.prepareStatement("INSERT INTO users (nickname, login, password) VALUES (?, ?, ?)");
           statement2.setString(1, "nick2");
           statement2.setString(2, "login2");
           statement2.setString(3, "pass2");
           statement2.execute();

           PreparedStatement statement3 = connection.prepareStatement("INSERT INTO users (nickname, login, password) VALUES (?, ?, ?)");
           statement3.setString(1, "nick3");
           statement3.setString(2, "login3");
           statement3.setString(3, "pass3");
           statement3.execute();

           connection.commit();

       } catch (SQLException e) {
           throw new RuntimeException("Something went wrong during database query", e);
       } finally {
           closeConnection(connection);
       }
   }

    @Override
    public void start() {
        System.out.println("Server Auth 1.0 is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Server 1.0 is showdown...");
    }

    @Override
    public String getNickByLoginAndPass(String login, String password) {
        String nickname = null;
        Connection connection = DataBaseConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM users WHERE login = ? AND password = ? ");
            statement.setString(1, "login");
            statement.setString(2, "password");
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                nickname = rs.getString("nickname");
            }
            return nickname;

        } catch (SQLException e) {
            throw new RuntimeException("Something went wrong", e);
        } finally {
            closeConnection(connection);
        }
    }

    private void closeConnection (Connection connection) {
        try {
            connection.close();
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
