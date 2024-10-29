package cuong.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cuong.dev.data.dao.OrderItemDao;
import cuong.dev.data.driver.MySQLDriver;
import cuong.dev.data.model.OrderItem;

public class OrderItemImpl implements OrderItemDao {

    @Override
    public boolean insert(OrderItem orderitem) {
        String sql = "INSERT INTO `ORDER_ITEMS`(QUANTITY, PRICE, ORDER_ID, PRODUCT_ID) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderitem.quantity);
            stmt.setDouble(2, orderitem.price);
            stmt.setInt(3, orderitem.order_id); // Đã sửa thành order_id
            stmt.setInt(4, orderitem.product_id);
            stmt.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(OrderItem orderitem) {
        String sql = "UPDATE `ORDER_ITEMS` SET QUANTITY=?, PRICE=?, ORDER_ID=?, PRODUCT_ID=? WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderitem.quantity);
            stmt.setDouble(2, orderitem.price);
            stmt.setInt(3, orderitem.order_id); // Đã sửa thành order_id
            stmt.setInt(4, orderitem.product_id);
            stmt.setInt(5, orderitem.id);
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(int id) {
        String sql = "DELETE FROM `ORDER_ITEMS` WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public OrderItem find(int id) {
        String sql = "SELECT * FROM `ORDER_ITEMS` WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                int order_id = rs.getInt("order_id");
                int product_id = rs.getInt("product_id");
                return new OrderItem(id, quantity, price, order_id, product_id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<OrderItem> findAll() {
        List<OrderItem> orderitemList = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIES";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                int order_id = rs.getInt("order_id");
                int product_id = rs.getInt("product_id");
                orderitemList.add(new OrderItem(id, quantity, price, order_id, product_id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return orderitemList;
    }

    @Override
    public List<OrderItem> findByOder(int orderId) {
        List<OrderItem> orderItemList = new ArrayList<>();
        String sql = "SELECT * FROM ORDER_ITEMS WHERE order_id = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, orderId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int quantity = rs.getInt("quantity");
                double price = rs.getDouble("price");
                int productId = rs.getInt("product_id");
                orderItemList.add(new OrderItem(id, quantity, price, orderId, productId));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return orderItemList;
    }

    @Override
    public List<OrderItem> findByProduct(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
