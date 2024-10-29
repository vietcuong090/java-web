package cuong.dev.data.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import cuong.dev.data.dao.ProductDao;
import cuong.dev.data.driver.MySQLDriver;
import cuong.dev.data.model.Product;
import cuong.dev.util.Constants;

public class ProductImpl implements ProductDao {

    @Override
    public boolean insert(Product product) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO `PRODUCTS`(NAME, DESCRIPTION, PRICE, QUANTITY, THUMBNAIL, VIEW, CATEGORY_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, product.name);
            stmt.setString(2, product.description);
            stmt.setDouble(3, product.price);
            stmt.setInt(4, product.quantity);
            stmt.setString(5, product.thumbnail);
            stmt.setInt(6, product.view);
            stmt.setInt(7, product.category_id);

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Product product) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO `PRODUCTS`(NAME, DESCRIPTION, PRICE, QUANTITY, THUMBNAIL, VIEW, CATEGORIES) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, product.name);
            stmt.setString(2, product.description);
            stmt.setDouble(3, product.price);
            stmt.setInt(4, product.quantity);
            stmt.setString(5, product.thumbnail);
            stmt.setInt(6, product.view);
            stmt.setInt(7, product.category_id);
            stmt.setInt(8, product.id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        String sql = "DELETE FROM PRODUCTS WHERE ID = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Product find(int id) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM PRODUCTS WHERE ID = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String description = rs.getString("description");
                String thumbnail = rs.getString("thumbnail");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                int view = rs.getInt("view");
                int categoryId = rs.getInt("category_id");
//                int productId = rs.getInt("product_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                return new Product(id, name, description, price, quantity, thumbnail, view, categoryId, createdAt);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS ORDER BY VIEW DESC ";

        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createAt = rs.getTimestamp("created_at");
                

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> hot(int limit) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM `PRODUCTS` ORDER BY view DESC LIMIT ?";

        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, limit);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createdAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> news(int limit) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM `PRODUCTS` ORDER BY created_at DESC LIMIT ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, limit);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createdAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> finByCategory(int categoryId) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE category_id = ?";

        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                Timestamp createdAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, categoryId, createdAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    @Override
    public List<Product> finByName(String key) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM `PRODUCTS` WHERE NAME LIKE ? ORDER BY VIEW DESC";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, "%" + key + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> finByCategoryOfName(int category_Id, String key) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM `PRODUCTS` OWHERE CATEGORY_ID = ? AND NAME LIKE ? ORDER BY VIEW DESC";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, category_Id);
            stmt.setString(2, "%" + key + "%");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> relatedProducList(Product product) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM `PRODUCTS` WHERE CATEGORY_ID = ? LIMIT ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, product.getCategory_id());
            stmt.setInt(2, Constants.RELATED_NUMBER);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createAt = rs.getTimestamp("create_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public boolean updateView(Product product) {
        String sql = "UPDATE `PRODUCTS` SET view = ? WHERE id = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, product.getView() + 1);
            stmt.setInt(2, product.getId());

            return stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Product> filter(int categoryId, String propertyName, String order) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS WHERE category_id = ? ORDER BY " + propertyName + " " + order;

        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, categoryId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                Timestamp createdAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, categoryId, createdAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> getProducts(int form, int amout) {
        List<Product> productList = new ArrayList<>();
        String sql = "SELECT * FROM PRODUCTS LIMIT ?, ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, form);
            stmt.setInt(2, amout);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                int quantity = rs.getInt("quantity");
                String thumbnail = rs.getString("thumbnail");
                int view = rs.getInt("view");
                int category_id = rs.getInt("category_id");
                Timestamp createAt = rs.getTimestamp("created_at");

                productList.add(new Product(id, name, description, price, quantity, thumbnail, view, category_id, createAt));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    
}
