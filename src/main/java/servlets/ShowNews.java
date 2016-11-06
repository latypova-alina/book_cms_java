package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Date;
import java.util.Arrays;

import static Services.NewsService.searchNewsId;
import static Services.NewsService.searchNewsImage;

/**
 * Created by alina on 06.11.16.
 */
public class ShowNews extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //int [] news_ids = searchNewsId(Date.valueOf("2016-11-07"));

        String [] image_path = new String[1];
        for (int i = 0; i < 2; i++) {
            if (searchNewsImage(i + 1) != null) {
                image_path[i] = searchNewsImage(i + 1);
            }
        }

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(Arrays.toString(image_path));



    }
}