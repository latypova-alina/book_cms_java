package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static Services.FilmService.searchFilmImage;


/**
 * Created by alina on 02.11.16.
 */
public class ShowFilms extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] image_path = new String[3];

        for (int i = 0; i < 2; i++) {
            if (searchFilmImage(i + 1) != null) {
                image_path[i] = searchFilmImage(i + 1);
            }
        }

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8"); 
        resp.getWriter().write(Arrays.toString(image_path));

    }
}
