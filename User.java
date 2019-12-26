import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private Profile profile;
    ArrayList<User> friends , friend_requests;

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

    void send_friend_request(User u) {
        u.friend_requests.add(this);
    }

    void accept_friend_request(User u) {
        friends.add(u);
        u.friends.add(this);
        friend_requests.remove(u);
    }

    void show_friend_requests() {
        for (User u : friend_requests)
            System.out.println(u.username);
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

    public String getUsername(){
        return this.username;
    }
    public Profile getProfile() {
        return profile;
    }
}
