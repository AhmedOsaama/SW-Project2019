import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private Profile profile;
    ArrayList<User> friends;

    public void showInfo() {
        System.out.println(username);
        System.out.println(password);
    }

    public void changePrivacy() {
    }

    public void changeSettings() {

    }

    public void modifyPost() {

    }

    public void AddFriend(User user) {
        for (User U : friends) {
            if (U == user) return;
        }
        friends.add(user);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }
}
