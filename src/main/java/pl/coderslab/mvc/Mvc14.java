package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book>list=new ArrayList<>();
        list.add(new Book("tytul1", "autor1", 123));
        list.add(new Book("tytul2", "autor2", 234));
        list.add(new Book("tytul3", "autor3", 345));
        request.setAttribute("books", list);
        getServletContext().getRequestDispatcher("/resultList.jsp")
                .forward(request, response);
    }
}
