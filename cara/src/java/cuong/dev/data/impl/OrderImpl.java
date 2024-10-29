package cuong.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cuong.dev.data.dao.OrderDao;
import cuong.dev.data.driver.MySQLDriver;
import cuong.dev.data.model.Order;
import java.sql.Timestamp;
import java.util.logging.Logger;
import java.util.logging.Level;

public class OrderImpl implements OrderDao {

    @Override
    public boolean insert(Order order) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO `ORDER`(CODE, STATUS, USER_ID) VALUES (?,?,?)";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, order.getCode());
            stmt.setString(2, order.getStatus());
            stmt.setInt(3, order.getUserId());

            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Order order) {
        // TODO Auto-generated method stub
        String sql = "UPDATE `ORDER` SET CODE=?, STATUS=?, USER_ID=? WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, order.getCode());
            stmt.setString(2, order.getStatus());
            stmt.setInt(3, order.getUserId()); // USER_ID
            stmt.setInt(4, order.getId()); // ID của ORDER cần cập nhật
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
        String sql = "DELETE FROM `ORDER` WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Order find(int id) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM `ORDER` WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String code = rs.getString("code");
                String status = rs.getString("status");
                int userId = rs.getInt("user_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                return new Order(id, code, status, userId, createdAt);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Order> findAll() {
        // TODO Auto-generated method stub
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM `ORDER`";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                String status = rs.getString("status");
                int userId = rs.getInt("user_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                orders.add(new Order(id, code, status, userId, createdAt));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return orders;
    }

    @Override
    public Order findByCode(String code) {
        String sql = "SELECT * FROM `ORDER` WHERE code = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, code);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String status = rs.getString("status");
                int user_id = rs.getInt("user_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                return new Order(id, code, status, user_id, createdAt);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Order> findByUser(int userId) {
        List<Order> orderList = new ArrayList<>();
        String sql = "SELECT * FROM ORDERS WHERE user_id = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, userId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                String status = rs.getString("status");
                Timestamp createdAt = rs.getTimestamp("created_at");

                orderList.add(new Order(id, code, status, userId, createdAt));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return orderList;
    }

    @Override
    public int countOrderByDay(String date) {
        int count = 0;
        String sql = "SELECT COUNT(*) AS count FROM `ORDER` where date(created_at)=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                count = rs.getInt("count");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;
    }

    @Override
    public double earningOrderByDay(String date) {
        double total = 0;
        String sql = "SELECT * FROM `ORDER` where date(created_at)=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, date);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                String status = rs.getString("status");
                int userId = rs.getInt("user_id");
                Timestamp createdAt = rs.getTimestamp("created_at");

                Order order = new Order(id, code, status, userId, createdAt);
//					total += order.getTotal();
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    @Override
    public List<Order> findByStatus(String status) {
        List<Order> orderList = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ORDERS WHERE STATUS = ?";
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, status);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String code = rs.getString("code");
                int userId = rs.getInt("user_id");
                Timestamp createdAt = rs.getTimestamp("created_at");
                orderList.add(new Order(id, code, status, userId, createdAt));
            }
        } catch (SQLException ex) {
        }

        return orderList;
    }

}
