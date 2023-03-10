package pl.coderslab.mvc;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/admin/*")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest) req;
        HttpServletResponse response =(HttpServletResponse) resp;
        HttpSession session=request.getSession();
        //response.getWriter().println(session.getAttribute("username"));
        if (session.getAttribute("username") == null) {
            response.sendRedirect(request.getContextPath() + "/login");
        } else {
            //response.sendRedirect(request.getContextPath() + "/admin");
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
