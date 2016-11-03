package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static Services.ActorImageService.searchActorImage;

/**
 * Created by alina on 02.11.16.
 */
public class ShowActors extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int actor_id = 1;

        if (searchActorImage(actor_id) != null) {

            String image_path = searchActorImage(actor_id);

            resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
            resp.setCharacterEncoding("UTF-8"); // You want world domination, huh?
            resp.getWriter().write(image_path);
            //req.setAttribute("image_path", image_path);

            //getServletContext().getRequestDispatcher("/WEB-INF/mainPage/mainPage.jsp").forward(req, resp);



        }



    }
}
