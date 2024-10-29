/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev.admin.order;

import cuong.dev.admin.BaseAdminServlet;
import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.OrderDao;
import cuong.dev.data.model.Order;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author BAP VN
 */
public class IndexOrderServlet extends BaseAdminServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        List<Order> orderList = orderDao.findAll();
        
        request.setAttribute("orderList", orderList);
        request.getRequestDispatcher("admin/order/index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
