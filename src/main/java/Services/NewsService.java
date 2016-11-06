package Services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static DB.DBConnection.getDBConnection;

/**
 * Created by alina on 06.11.16.
 */
public class NewsService {
    public static int[] searchNewsId(Date news_date) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement ps = connection.prepareStatement("Select id from News where news_date = ?");
            ps.setDate(1, news_date);
            ResultSet set = ps.executeQuery();

            int i=0;
            int[] news_ids = new int[3];

            while(set.next()) {
                news_ids[i] = set.getInt("id");
                i++;
            }
            return news_ids;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String searchNewsImage(int news_id) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement ps = connection.prepareStatement("Select news_image from news where id = ?");
            ps.setInt(1, news_id);
            ResultSet set = ps.executeQuery();

            if(set.next()) {
                String img = set.getString(1);
                return img;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static String searchNewsTitle(int news_id) {
        try {
            Connection connection = (Connection) getDBConnection();
            PreparedStatement ps = connection.prepareStatement("Select title from news where id = ?");
            ps.setInt(1, news_id);
            ResultSet set = ps.executeQuery();

            if(set.next()) {
                String title = set.getString(1);
                return title;

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
