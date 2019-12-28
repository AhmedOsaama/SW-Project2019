import java.util.Scanner;

public class Login {

    public User signIn() {
        User userr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username !");
        String username = scanner.nextLine();
        System.out.println("Enter your password !");
        String password = scanner.nextLine();
        userr = new User();
        userr = userr.findUser(username, password);
        return userr;
    }
}
