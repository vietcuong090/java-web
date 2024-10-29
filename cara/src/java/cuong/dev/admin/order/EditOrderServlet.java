/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev.admin.order;

import cuong.dev.admin.BaseAdminServlet;
import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.OrderDao;
import cuong.dev.data.dao.UserDao;
import cuong.dev.data.model.Order;
import cuong.dev.data.model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author BAP VN
 */
public class EditOrderServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order  = orderDao.find(orderId);

        request.setAttribute("order", order);
        request.getRequestDispatcher("admin/order/edit.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order  = orderDao.find(orderId);

        
        String status = request.getParameter("status");
        order.setStatus(status);
       
        
        orderDao.update(order);
        response.sendRedirect("IndexOrderServlet");
    }

}
