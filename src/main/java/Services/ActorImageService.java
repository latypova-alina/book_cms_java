package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static DB.DBConnection.getDBConnection;

/**
 * Created by alina on 28.10.16.
 */
public class ActorImageService {
    public static String searchActorImage(int actor_id) {
        try {
            Connection connection = (Connection) getDBConnection();


            PreparedStatement ps = connection.prepareStatement("Select image_path from actors_image where actor_id = ?");
            ps.setInt(1, actor_id);
            ResultSet set = ps.executeQuery();

            //ps.setBinaryStream(2, fis, file.length());
            //ps.executeUpdate();
            //ps.close();
            //fis.close();

            if (set.next()) {

                String image_path = set.getString(1);
                return image_path;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
