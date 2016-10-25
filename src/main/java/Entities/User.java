package Entities;

/**
 * Created by alina on 17.10.16.
 */
public class User {
    private String username;
    private String email;
    private String password;



    public User(String username, String email, String password) {

        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() { return username; }

    public String getEmail() {
        return email;
    }

    public String getPassword() { return password; }
}
