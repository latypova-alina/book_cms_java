package Services;

import Entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static DB.DBConnection.getDBConnection;

/**
 * Created by alina on 17.10.16.
 */
public class UserService {
    public void add(User user) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement("INSERT INTO users(Username, Email, Password) VALUES (?,?,?)");
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword());
            pstmt.execute();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static User searchLogin(String email) {
        Connection connection = null;
        try {
            connection = getDBConnection();
            assert connection != null;
            PreparedStatement pstmt = connection.prepareStatement("SELECT username, email, password FROM users WHERE email = ?;");
            pstmt.setString(1, email);
            ResultSet set = pstmt.executeQuery();
            if (set.next()) {

                String username = set.getString(1);
                String password = set.getString(3);
                return new User(username, email, password);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

}

