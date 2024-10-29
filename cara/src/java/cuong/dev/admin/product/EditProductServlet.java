/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package cuong.dev.admin.product;

import cuong.dev.admin.BaseAdminServlet;
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
public class EditProductServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("productId"));
        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
        Product product = productDao.find(productId);
        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
        List<Category> categoryList = categoryDao.findAll();

        request.setAttribute("categoryList", categoryList);
        

        request.setAttribute("product", product);
        request.getRequestDispatcher("admin/product/edit.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String thumbnail = request.getParameter("thumbnail");
        double price = Double.parseDouble(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        int productId = Integer.parseInt(request.getParameter("productId"));

        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
        Product product = productDao.find(productId);

        product.setName(name);
        product.setDescription(description);
        product.setThumbnail(thumbnail);
        product.setPrice(price); // Fix: Setting the price correctly
        product.setQuantity(quantity);
        product.setCategory_id(categoryId);

        productDao.update(product);
        response.sendRedirect("IndexProductServlet");
    }

}
