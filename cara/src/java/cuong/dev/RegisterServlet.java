package cuong.dev;

import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.UserDao;
import cuong.dev.data.model.User;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class RegisterServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {    
              request.getRequestDispatcher("register.jsp").include(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        // Mã hóa mật khẩu bằng MD5
        String hashedPassword = hashPasswordWithMD5(password);
        
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(email);
        
        if(user != null){
            session.setAttribute("error", "Email existed");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        }else{
            user = new User(email, hashedPassword, "user");
            userDao.insert(user);
            response.sendRedirect("LoginServlet");
        }
    }

    // Phương thức mã hóa MD5
    private String hashPasswordWithMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
