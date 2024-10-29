package cuong.dev.data.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cuong.dev.data.dao.UserDao;
import cuong.dev.data.driver.MySQLDriver;
import cuong.dev.data.model.User;

public class UserImpl implements UserDao {

        @Override
      public boolean insert(User user) {
          String sql = "INSERT INTO `USER`(EMAIL, PASSWORD, ROLE) VALUES (?, ?, ?)";
          try {
              Connection conn = MySQLDriver.getIntance().getConnection();
              PreparedStatement stmt = conn.prepareStatement(sql);
              stmt.setString(1, user.getEmail());
              stmt.setString(2, user.getPassword()); // Mật khẩu đã mã hóa
              stmt.setString(3, user.getRole());
              stmt.execute();
          } catch (SQLException e) {
              e.printStackTrace();
              return false;
          }
          return true;
      }


    @Override
    public boolean update(User user) {
        // TODO Auto-generated method stub
        String sql = "UPDATE USER SET EMAIL=?, PASSWORD=?, ROLE=? WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.email);
            stmt.setString(2, user.password);
            stmt.setString(3, user.role);
            stmt.setInt(4, user.id);
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
        String sql = "DELETE FROM USER WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id); // Ví dụ: ID được mã hóa cứng, điều chỉnh khi cần thiết
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public User find(int id) {
        // TODO Auto-generated method stub
//        String sql = "SELECT * FROM `USER` WHERE ID=?";
            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                return new User(id, email, password, role);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM `USER` ";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String password = rs.getString("password");
                String role = rs.getString("role");
                userList.add(new User(id, email, password, role));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public User find(String email) {
        String sql = "SELECT * FROM `USER` WHERE EMAIL=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String password = rs.getString("password");
                String role = rs.getString("role");
                return new User(email, password, role);

            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User find(String email, String password) {
        String sql = "SELECT * FROM `USER` WHERE EMAIL=? AND PASSWORD=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {  
                String role = rs.getString("role");
                return new User(email, password, role);  
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;  
    }

}
