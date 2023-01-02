package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/get2")
public class get2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            Map<String, String[]> parameterMap = request.getParameterMap();
            for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
                System.out.println(entry.getKey());
                String key = entry.getKey();
                String[] values = entry.getValue();
                for (int i = 0; i < values.length; i++) {
                    response.getWriter().append(key).append("-").append(values[i]);
                    response.getWriter().println("");
                }

            }
        } catch (Exception e) {
            response.getWriter().println("Błąd w sztuce");
        }
    }
}
