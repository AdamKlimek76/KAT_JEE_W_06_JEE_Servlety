package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        Random random=new Random();
        int number1 = random.nextInt(101);
        int number2 = random.nextInt(101);
        int sum=number1+number2;
        session.setAttribute("captcha", sum);

        final String FORM="<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<form action=\"/session5\" method=\"post\">\n" +
                "    Imie:\n" +
                "    <input type=\"text\" name=\"name\">\n" +
                "    Nazwisko:\n" +
                "    <input type=\"number\" name=\"surname\">\n" +
                "    Email\n" +
                "    <input type=\"number\" name=\"email\">\n" +
                "    <input type=\"submit\" value=\"Wyślij\">\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>";

        response.getWriter().append(FORM);
        response.getWriter().println("");
        response.getWriter().append("Podaj wynik dodawania");
    }





}
