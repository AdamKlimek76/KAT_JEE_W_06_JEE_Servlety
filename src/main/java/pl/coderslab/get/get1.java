package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/get1")
public class get1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Integer start = Integer.parseInt(request.getParameter("start"));
            Integer end = Integer.parseInt((request.getParameter("end")));

            for (int i = start; i <= end; i++) {
                response.getWriter().append(String.valueOf(i)+"\n");

            }
        } catch (NumberFormatException e) {
            response.getWriter().append("BRAK");
        }
    }
}