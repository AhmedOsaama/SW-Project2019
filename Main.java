import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public User FindUser(ArrayList<User> users, String username) {
        for (User U : users) {
            if (username.equals(U.getUsername())) {
                return U;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User userr;
        ArrayList<User> users = new ArrayList<>();      //ArrayList to store registered users.
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("If you want to register Enter: 1, Login Enter: 2 or Exit Enter 0");
            int in = scanner.nextInt();

            if (in == 1)         //Register
            {
                Registration registration = new Registration();
                registration.register();

                userr = Registration.user;
                users.add(userr);
            } else if (in == 0)     //Exit
            {
                break;
            }
        }
    }
}
