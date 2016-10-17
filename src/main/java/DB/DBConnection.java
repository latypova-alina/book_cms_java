package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


/**
 * Created by alina on 17.10.16.
 */

public class DBConnection {
    public static Connection getDBConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        Properties properties = new Properties();
        properties.setProperty("user", "alina");
        properties.setProperty("password", "123454321");

        properties.setProperty("useUnicode", "true");
        properties.setProperty("characterEncoding", "UTF-8");
        return  DriverManager.getConnection("jdbc:postgresql://localhost:5432/Book_cms_java",
                properties);
    }
}
