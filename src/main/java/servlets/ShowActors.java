package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static Services.ActorService.searchActorImage;

/**
 * Created by alina on 02.11.16.
 */
public class ShowActors extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String[] image_path = new String[3];

        for (int i = 0; i < 2; i++) {
            if (searchActorImage(i + 1) != null) {
                image_path[i] = searchActorImage(i + 1);
            }
        }


        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        resp.getWriter().write(Arrays.toString(image_path));


    }
}
