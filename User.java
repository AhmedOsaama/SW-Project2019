import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private Profile profile;
    private ArrayList<User> friends = new ArrayList<>() , friend_requests = new ArrayList<>();
    public static ArrayList<User> users = new ArrayList<>();      //ArrayList to store registered users.

    public void showInfo() {
        System.out.println(username);
        System.out.println(password);
    }

    public User findUser(String username) {
        for (User U : users) {
            if (username.equals(U.getUsername())) {
                return U;
            }
        }
        return null;
    }

    public User findUser(String username,String password) {
        for (User U : users) {
            if (username.equals(U.getUsername()) && password.equals(U.getPassword())) {
                return U;
            }
        }
        return null;
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

    void accept_friend_request(int i) {
        if (i <= 0 || i > friend_requests.size()) return;
        friends.add(friend_requests.get(i - 1));
        friend_requests.get(i - 1).friends.add(this);
        friend_requests.remove(friend_requests.get(i - 1));
    }

    void show_friend_requests() {
        System.out.println("You have no friend requests");
        for (int i = 0 ;i < friend_requests.size() ;i++)
            System.out.println(i + 1 + " " + friend_requests.get(i).username);
    }

    void show_friends() {
        System.out.println("You have no friends");
        for (User u : friends)
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
    public String getPassword(){
        return this.password;
    }
    public Profile getProfile() {
        return profile;
    }
}
