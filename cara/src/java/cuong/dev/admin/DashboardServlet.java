/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev.admin;

import cuong.dev.BaseServlet;
import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.OrderDao;
import cuong.dev.data.model.Order;
import cuong.dev.data.model.User;
import cuong.dev.util.GetDateTime;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BAP VN
 */
public class DashboardServlet extends BaseServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         HttpSession session = request.getSession(false);
         User user = (User) session.getAttribute("user");

           if (user == null || !user.getRole().equals("admin")) {
               response.sendRedirect("LoginServlet");
               return;
           }
         OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
         LocalDateTime now = LocalDateTime.now();
        int numberOrderToday = orderDao.countOrderByDay(dtf.format(now));

         List<Order> orderList = orderDao.findAll();
        int numberOrderAll = orderList.size();
        List<Order> orderPendingList = orderDao.findByStatus("pending");

        int numberOrderPending = orderPendingList.size();
        int numberOrderFinished = numberOrderAll - numberOrderPending;


        request.setAttribute("numberOrderToday", numberOrderToday);
        request.setAttribute("numberOrderAll", numberOrderAll);
        request.setAttribute("numberOrderPending", numberOrderPending);   
        request.setAttribute("numberOrderFinished", numberOrderFinished);
        
//        chart
        List<String> dateList = GetDateTime.get7Date();
        List<Integer> orderByDateList = new ArrayList<>();
        for (String d : dateList) {
           int n = orderDao.countOrderByDay(d);
           orderByDateList.add(n);
        }

        request.setAttribute("dateList", dateList);
        request.setAttribute("orderByDateList", orderByDateList);
        request.setAttribute("orderPendingList", orderPendingList);
        request.getRequestDispatcher("admin/dashboard.jsp").include(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
