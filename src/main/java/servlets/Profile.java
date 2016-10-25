package servlets;

import Entities.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static Services.UserService.searchLogin;

/**
 * Created by alina on 18.10.16.
 */
public class Profile extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession session = req.getSession();
        if (session.getAttribute("email") == null) {
            resp.sendRedirect("/login");
        }

        String login = (String) session.getAttribute("email");

        if (searchLogin(login) != null) {
            User user = searchLogin(login);
            assert user != null;


            req.setAttribute("username", user.getUsername());
            req.setAttribute("email", user.getEmail());
            req.setAttribute("password", user.getPassword());

            getServletContext().getRequestDispatcher("/WEB-INF/Profile/Profile.jsp").forward(req, resp);
        }

    }
}
