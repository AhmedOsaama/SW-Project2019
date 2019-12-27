import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User userr;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("If you want to register Enter: 1, Login Enter: 2 or Exit Enter 0");
            int in = scanner.nextInt();
            scanner.nextLine();

            if (in == 1)         //Register
            {
                Registration registration = new Registration();
                registration.register();

                userr = Registration.user;
                User.users.add(userr);
            }
            else if(in==2)      //Login
            {
                Login login = new Login();
                userr = login.signIn();

                if(userr!=null)
                {
                    System.out.println("You have logged in !");

                }
                else
                    System.out.println("Invalid username or password");


            }
            else if (in == 0)     //Exit
            {
                break;
            }
        }

    }
}
