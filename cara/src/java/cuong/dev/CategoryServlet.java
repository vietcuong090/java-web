/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev;

import cuong.dev.data.dao.CategoryDao;
import cuong.dev.data.dao.DatabaseDao;
import cuong.dev.data.dao.ProductDao;
import cuong.dev.data.model.Category;
import cuong.dev.data.model.Product;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 * @author BAP VN
 */
public class CategoryServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    super.doGet(request, response);
    int categoryId = Integer.parseInt(request.getParameter("categoryId"));
    ProductDao productDao = DatabaseDao.getInstance().getProductDao();
    
    List<Product> productList;
    String property = request.getParameter("property");
    String order = request.getParameter("order");

    if (property != null && order != null && property.matches("name|price|createdAt") && order.matches("ASC|DESC")) {
        productList = productDao.filter(categoryId, property, order);
    } else {
        productList = productDao.finByCategory(categoryId);  // Gán kết quả vào productList
    }

    CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
    Category category = categoryDao.find(categoryId);

    request.setAttribute("productList", productList);
    request.setAttribute("category", category);
    request.getRequestDispatcher("category.jsp").include(request, response);
}


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
