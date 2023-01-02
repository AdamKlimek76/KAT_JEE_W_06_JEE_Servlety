package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get3")
public class get3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int width = Integer.parseInt(request.getParameter("width"));
            int height = Integer.parseInt((request.getParameter("height")));

            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <=width ; j++) {
                    response.getWriter().print(i*j + " ");
                }
                response.getWriter().println("");
            }
        } catch (NumberFormatException e) {
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <=5 ; j++) {
                    response.getWriter().print(i*j + " ");
                }
                response.getWriter().println("");
            }
        }
    }
}
