package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static Services.FilmService.searchFilmName;

/**
 * Created by alina on 05.11.16.
 */
public class ShowFilmsNames extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String[] names = new String[3];

        for (int i = 0; i < 2; i++) {
            if (searchFilmName(i + 1) != null) {
                names[i] = searchFilmName(i + 1);
            }
        }


        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        resp.getWriter().write(Arrays.toString(names));


    }
}
