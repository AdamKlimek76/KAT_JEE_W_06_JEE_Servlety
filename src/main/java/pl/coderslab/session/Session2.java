package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            List<Integer> numberList = (List<Integer>) session.getAttribute("numberList");
            Integer number = Integer.parseInt(request.getParameter("userNumber"));
            numberList.add(number);
            double sum = 0.0;
            for (int i = 0; i < numberList.size(); i++) {
                sum += numberList.get(i);
                response.getWriter().println(numberList.get(i));
            }
            response.getWriter().println("Średnia ocen");
            response.getWriter().println(sum / numberList.size());

        } catch (NullPointerException e) {
            HttpSession session = request.getSession();
            List<Integer> numberList = new ArrayList<>();
            Integer number = Integer.parseInt(request.getParameter("userNumber"));
            numberList.add(number);
            session.setAttribute("numberList", numberList);
            response.getWriter().println(number);
            response.getWriter().println("Średnia ocen");
            response.getWriter().println(number);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; utf-8");
        String FORM = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/session2\" method=\"post\">\n" +
                "    Ocena\n" +
                "    <input type=\"number\" name=\"userNumber\">\n" +
                "    <input type=\"submit\" value=\"Wyślij\">\n" +
                "</form>\n" +
                "\n" +
                "</body>\n" +
                "</html>";
        response.getWriter().append(FORM);
    }

}
