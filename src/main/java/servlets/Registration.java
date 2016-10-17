package servlets;

import Entities.User;
import Services.UserService;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by alina on 11.10.16.
 */
public class Registration extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/forms/registrationForm.ftl").forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        User user = new User(username, email, password);
        System.out.println(user.getUsername());
        UserService service = new UserService();
        service.add(user);




    }
}
