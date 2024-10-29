/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev.admin.product;

import cuong.dev.admin.BaseAdminServlet;
import cuong.dev.data.dao.CategoryDao;
import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.ProductDao;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author BAP VN
 */
public class DeleteProductServlet extends BaseAdminServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        ProductDao prodcutDao = DatabaseDao.getInstance().getProductDao();
      
        prodcutDao.delete(productId);
        
        response.sendRedirect("IndexProductServlet");
    }
    
}
