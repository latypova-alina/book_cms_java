package Services;

import Entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

    }
