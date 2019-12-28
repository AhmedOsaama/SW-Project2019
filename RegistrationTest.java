import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest {
    @Test(expected = NullPointerException.class)
    public void Register()      //Testing whether a user has registered by printing his password
    {
        User user;
        user = Registration.user;
        System.out.println(user.getPassword());
    }

}
