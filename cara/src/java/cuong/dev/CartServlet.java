/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev;

import cuong.dev.data.model.OrderItem;
import cuong.dev.util.Helper;
import java.io.IOException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author BAP VN
 */
public class CartServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        super.doGet(request, response);
        HttpSession session = request.getSession();
        List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<OrderItem>();
        }
        request.setAttribute("cart", cart);
        request.setAttribute("total", Helper.total(cart));
        System.out.println("Cart after adding product: " + cart);

        request.getRequestDispatcher("cart.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws jakarta.servlet.ServletException, IOException {
        String action = request.getParameter("action");

        // Kiểm tra nếu action là null
        if (action == null || action.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Action parameter is missing.");
            return;
        }

        switch (action) {
            case "create":
                createOrder(request);
                break;
            case "update":
                updateOrder(request);
                break;
            case "delete":
                deleteOrder(request);
                break;
            default:
                throw new AssertionError("Unknown action: " + action);
        }

        response.sendRedirect("CartServlet");
    }

    private void createOrder(HttpServletRequest request) {
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int product_id = Integer.parseInt(request.getParameter("product_id"));
        double price = Double.parseDouble(request.getParameter("price"));

        //tao moi mot doi tuong orderitem
        OrderItem orderItem = new OrderItem(quantity, price, 0, product_id);

        HttpSession session = request.getSession();
        List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");

        boolean isExistInCart = false;

        if (cart == null) {
            cart = new ArrayList<>();
        } else {
            /*cu phap for each trong java: 
            for (Type element : collection) {
            
            }
            | type: kiểu dữ liệu  
            | element: bien dai dien
            | collection:  tập hợp chứa các phần tử mà bạn muốn lặp qua
             */
            for (OrderItem ord : cart) {
                if (ord.getProduct_id() == product_id) {
                    ord.setQuantity(ord.getQuantity() + quantity);
                    isExistInCart = true;
                    break;
                }
            }
        }
        if (!isExistInCart) {
            cart.add(orderItem);
        }
        session.setAttribute("cart", cart);
    }

    private void updateOrder(HttpServletRequest request) {
    int product_id = Integer.parseInt(request.getParameter("product_id"));
    int quantity = Integer.parseInt(request.getParameter("quantity"));
    
    HttpSession session = request.getSession();
    List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");

    if (cart != null && !cart.isEmpty()) {
        for (OrderItem ord : cart) {
            if (ord.getProduct_id() == product_id) {
                ord.setQuantity(quantity); // Cập nhật số lượng mới
                break;
            }
        }
    }
    session.setAttribute("cart", cart);
}


   private void deleteOrder(HttpServletRequest request) {
    int product_id = Integer.parseInt(request.getParameter("product_id"));
    HttpSession session = request.getSession();
    List<OrderItem> cart = (List<OrderItem>) session.getAttribute("cart");

    if (cart != null) {
        Iterator<OrderItem> iterator = cart.iterator();
        while (iterator.hasNext()) {
            OrderItem ord = iterator.next();
            if (ord.getProduct_id() == product_id) {
                iterator.remove(); // Xóa sản phẩm
            }
        }
    }
    session.setAttribute("cart", cart);
}


}
