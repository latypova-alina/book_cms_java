package Services;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import static DB.DBConnection.getDBConnection;

/**
 * Created by alina on 02.11.16.
 */
public class FilmService {
    public static String searchFilmImage(int film_id) {
        try {
            Connection connection = (Connection) getDBConnection();


            PreparedStatement ps = connection.prepareStatement("Select image_path from films_image where film_id = ?");
            ps.setInt(1, film_id);
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
    public static String searchFilmName(int film_id) {
        try {
            Connection connection = (Connection) getDBConnection();


            PreparedStatement ps = connection.prepareStatement("Select name from films where id = ?");
            ps.setInt(1, film_id);
            ResultSet set = ps.executeQuery();

            //ps.setBinaryStream(2, fis, file.length());
            //ps.executeUpdate();
            //ps.close();
            //fis.close();

            if (set.next()) {

                String name = set.getString(1);
                return name;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String searchFilmDescription(int film_id) {
        try {
            Connection connection = (Connection) getDBConnection();


            PreparedStatement ps = connection.prepareStatement("Select description from films where id = ?");
            ps.setInt(1, film_id);
            ResultSet set = ps.executeQuery();

            //ps.setBinaryStream(2, fis, file.length());
            //ps.executeUpdate();
            //ps.close();
            //fis.close();

            if (set.next()) {

                String description = set.getString(1);
                return description;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static int[] sortByCategory(String category) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement ps = connection.prepareStatement("Select film_id from categories where category = ?");
            ps.setString(1, category);
            ResultSet set = ps.executeQuery();
            //ps.setBinaryStream(2, fis, file.length());
            //ps.executeUpdate();
            //ps.close();
            //fis.close();
            int i=0;
            int n = 2;
            int[] films = new int[n];

            while(set.next()) {
                films[i] = set.getInt("film_id");
                i++;
            }
            return films;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
