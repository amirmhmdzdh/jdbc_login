import java.sql.SQLException;
import java.util.Scanner;

public class UserService {

    private final Scanner scanner = new Scanner(System.in);
    private final UserRepository userRepository = new UserRepository();

    public UserService() throws SQLException {
    }

    public void signUp() throws SQLException {

        System.out.println("please enter your firstname: ");
        String firstname = scanner.nextLine();

        System.out.println("please enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("please enter your username: ");
        String username = scanner.nextLine();

        System.out.println("please enter your password: ");
        String password = scanner.nextLine();

        User user = new User(firstname, lastname, username, password);
        System.out.println(user);
        int result = userRepository.registerUser(user);
        if (result == 1)
            System.out.println(firstname + " you successfully register :)");
        else
            System.out.println("somthing is wrong :[");

    }

    public void signIn() throws SQLException {
        System.out.println("please enter your username ");
        String username = scanner.nextLine();

        System.out.println("please enter your password ");
        String password = scanner.nextLine();

        User user = UserRepository.findbyusername(username);

        if (user == null)
            System.out.println("please register first");
        else if (!user.getPassword().equals(password)) {
            System.out.println("please enter correct password");
        } else
            System.out.println("welcome " + user.getUsername());

    }


}






