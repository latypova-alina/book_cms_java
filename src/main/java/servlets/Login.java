package servlets;

import Entities.User;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import javax.security.auth.login.Configuration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static Services.UserService.searchLogin;

/**
 * Created by alina on 17.10.16.
 */
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");


        User user = searchLogin(email);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                HttpSession session = req.getSession();
                session.setAttribute("email", email);
                resp.sendRedirect("/profile");
            }
        } else {
            PrintWriter out = resp.getWriter();
            out.print("Invalid");
        }


    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("email") != null) {
            resp.sendRedirect("/profile");
            return;
        }else{

        }

        getServletContext().getRequestDispatcher("/WEB-INF/forms/loginForm.jsp").forward(req, resp);
    }
}