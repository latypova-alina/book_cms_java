package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

import static Services.NewsService.searchNewsId;
import static Services.NewsService.searchNewsImage;
import static Services.NewsService.searchNewsTitle;

/**
 * Created by alina on 06.11.16.
 */
public class ShowNewsTitle extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        //int [] news_ids = searchNewsId(Date.valueOf("07-11-2016"));
        String [] titles = new String[1];
        for (int i = 0; i < titles.length; i++) {
            if (searchNewsTitle(i + 1) != null) {
                titles[i] = searchNewsTitle(i + 1);
            }
        }

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(Arrays.toString(titles));



    }
}
