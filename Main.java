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
                userr = registration.register();
                User.users.add(userr);
            }
            else if(in==2)      //Login
            {
                Login login = new Login();
                userr = login.signIn();

                if(userr!=null) {
                    System.out.println("You have logged in !");
                    while (true) {
                        System.out.println("to add a friend Enter 1");
                        System.out.println("to show friend requests Enter 2");
                        System.out.println("to show friends Enter 3");
                        System.out.println("to sign out Enter 4");

                        in = scanner.nextInt();
                        scanner.nextLine();

                        if (in == 1) {
                            System.out.println("Enter the username :");
                            String name = scanner.nextLine();
                            User u = userr.findUser(name);
                            if (u != null && u.getUsername() != userr.getUsername()) {
                                userr.send_friend_request(u);
                                System.out.println("friend request has been sent");
                            } else {
                                System.out.println("Invalid username");
                            }
                        } else if (in == 2) {
                            userr.show_friend_requests();
                            System.out.println("Enter the number of request you want to accept or 0 to exit");
                            in = scanner.nextInt();
                            scanner.nextLine();
                            userr.accept_friend_request(in);
                        } else if (in == 3) {
                            userr.show_friends();
                        } else
                            break;
                    }
                }  else
                    System.out.println("Invalid username or password");

            }
            else if (in == 0)     //Exit
            {
                break;
            }
        }

    }
}
