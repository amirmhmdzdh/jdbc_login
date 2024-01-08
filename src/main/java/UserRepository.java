import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRepository {

    private static final JdbcConnection jdbcConnection;

    static {
        try {
            jdbcConnection = new JdbcConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public UserRepository() throws SQLException {
    }

    public int registerUser(User user) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String addUser = "INSERT INTO users (first_name ,last_name , username , password) VALUES (?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(addUser);

        preparedStatement.setString(1, user.getFirsname());
        preparedStatement.setString(2, user.getLastname());
        preparedStatement.setString(3, user.getUsername());
        preparedStatement.setString(4, user.getPassword());

        int result = preparedStatement.executeUpdate();
        return result;

    }

    public static User findbyusername(String username) throws SQLException {
        Connection connection = jdbcConnection.getConnection();

        String findUser = "SELECT * FROM users WHERE username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(findUser);
        preparedStatement.setString(1, username);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstname = resultSet.getString("first_name");
            String lastname = resultSet.getString("last_name");
            String fetchusername = resultSet.getString("username");
            String password = resultSet.getString("password");
            return new User(id,firstname,lastname,fetchusername,password);
        }

        else
            return null;

    }


}
