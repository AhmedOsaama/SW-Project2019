import java.util.Scanner;

public class Registration {
    private String fname;
    private String lname;
    private String username;
    private String password;
    private String email;
    private String gender;
    private String country;
    private String dob;

   public static User user ;

    public User register()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your First name");
         fname = scanner.nextLine();
        System.out.println("Please Enter your Last name");
        lname = scanner.nextLine();
        System.out.println("Please Enter your E-mail");
        email = scanner.nextLine();
        System.out.println("Please Enter a Username");
        username = scanner.nextLine();
        System.out.println("Please Enter your password");
        password = scanner.nextLine();
        System.out.println("Please Enter your Gender");
        gender = scanner.nextLine();
        System.out.println("Please Enter your Country");
        country = scanner.nextLine();
        System.out.println("Please Enter your DOB");
        dob = scanner.nextLine();
        System.out.println("You have Created a new Account");

        user = new User();
        user.setPassword(password);
        user.setUsername(username);

        user.setProfile(new Profile());
        user.getProfile().setName(username);

        return user;
    }
}
