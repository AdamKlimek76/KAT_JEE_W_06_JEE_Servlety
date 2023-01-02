package pl.coderslab.mvc;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class Filter1 implements Filter {

    final public static String UTFCODING="utf-8";
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        req.setCharacterEncoding(UTFCODING);
        resp.setCharacterEncoding(UTFCODING);
        HttpServletRequest request=(HttpServletRequest) req;
        HttpSession session=request.getSession();
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
