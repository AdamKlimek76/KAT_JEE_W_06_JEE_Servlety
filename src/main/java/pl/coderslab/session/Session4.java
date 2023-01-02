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

@WebServlet("/session4")
public class Session4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        CartItem cartItem = createCartItem(request);
        List<CartItem> cartItemList = null;
        if (session.getAttribute("cartItems") == null) {
            cartItemList = new ArrayList<>();
            printCartItems(response, session, cartItem, cartItemList);
        } else {
            cartItemList = (List) session.getAttribute("cartItems");
            printCartItems(response, session, cartItem, cartItemList);
        }
    }

    private void printCartItems(HttpServletResponse response, HttpSession session, CartItem cartItem, List<CartItem> cartItemList) throws IOException {
        cartItemList.add(cartItem);
        session.setAttribute("cartItems", cartItemList);
        double sum = 0.00;
        for (int i = 0; i < cartItemList.size(); i++) {
            sum += cartItemList.get(i).getQuantity() * cartItemList.get(i).getPrice();
            response.getWriter().append(cartItemList.get(i).getName())
                    .append(" ")
                    .append(String.valueOf(cartItemList.get(i).getQuantity()))
                    .append(" x ")
                    .append(String.valueOf(cartItemList.get(i).getPrice()))
                    .append(" = ")
                    .append(String.valueOf(cartItemList.get(i).getQuantity() * cartItemList.get(i).getPrice()));
            response.getWriter().println("");
        }
        response.getWriter().append("SUMA: ").append(String.valueOf(sum));
    }


    private CartItem createCartItem(HttpServletRequest request) {
        String name = request.getParameter("product");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        double price = Double.parseDouble(request.getParameter("price"));
        return new CartItem(name, quantity, price);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
