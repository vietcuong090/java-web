/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev;

import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.UserDao;
import cuong.dev.data.model.User;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author BAP VN
 */
public class LoginServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            response.sendRedirect("HomeServlet");
        }
        else {
            request.getRequestDispatcher("login.jsp").include(request, response);
        }

    }

   @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    HttpSession session = request.getSession();

    String email = request.getParameter("email");
    String password = request.getParameter("password");

    // Mã hóa mật khẩu nhập vào bằng MD5
//    String hashedPasswordString = MD5Hashing.getMD5(password);
    
    UserDao userDao = DatabaseDao.getInstance().getUserDao();

    // Sử dụng mật khẩu đã mã hóa để tìm kiếm trong cơ sở dữ liệu
    User user = userDao.find(email, password);

    if (user == null) {
        session.setAttribute("error", "Login Failed");
        response.sendRedirect("login.jsp");
    } else {
        session.setAttribute("user", user);

        if (user.getRole().equals("admin")) {
            response.sendRedirect("DashboardServlet");
        } else {
            response.sendRedirect("HomeServlet");
        }
    }
}

//    private static class MD5Hashing {
//
//        public static String getMD5(String input) {
//        try {
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            byte[] messageDigest = md.digest(input.getBytes());
//            StringBuilder hexString = new StringBuilder();
//            for (byte b : messageDigest) {
//                hexString.append(String.format("%02x", b));
//            }
//            return hexString.toString();
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//    }

    }
