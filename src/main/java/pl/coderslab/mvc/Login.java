package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class Login extends HttpServlet {
    private final static String USER = "admin";
    private final static String PASSWORD = "coderslab";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        if (user.equals(USER) && pass.equals(PASSWORD)) {
            HttpSession session=request.getSession();
            session.setAttribute("username", user);
           // getServletContext().getRequestDispatcher("/admin").forward(request, response);
            response.sendRedirect(request.getContextPath() + "/admin");

        } else {
            request.setAttribute("error", "Blad w trakcie logowania. Sprobuj ponownie.");
            getServletContext().getRequestDispatcher("/login.jsp")
                    .forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/login.jsp")
                .forward(request, response);
    }
}
