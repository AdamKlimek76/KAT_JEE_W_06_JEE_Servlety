package pl.coderslab.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getCookie")
public class Cookie1Get extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Cookie[] cookies = request.getCookies();
            String cookieValue = "";

            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("User")) {
                    cookieValue = cookies[i].getValue();
                    break;
                }
            }
            response.getWriter().println(cookieValue);
        } catch (NullPointerException e) {
            response.getWriter().println("Brak ciasteczka do pobrania");
        }
    }
}
