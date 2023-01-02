package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cookie52")
public class Cookie52 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String cookieSearchName = "cookie51";
            boolean cookieExist = false;
            Cookie[] cookies = request.getCookies();
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals(cookieSearchName)) {
                    cookieExist = true;
                    cookies[i].setMaxAge(0);
                    break;
                }
            }
            if (cookieExist) {
                response.getWriter().println("Witaj na stronie cookie 52");
            } else {
                response.sendRedirect(request.getContextPath() + "/cookie51?msg=firstVisitCookie");
            }

        } catch (NullPointerException e) {

            response.sendRedirect(request.getContextPath() + "/cookie51?msg=firstVisitCookie");
        }
    }
}
