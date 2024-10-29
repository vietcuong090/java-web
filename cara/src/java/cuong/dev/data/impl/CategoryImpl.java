package cuong.dev.data.impl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cuong.dev.data.dao.CategoryDao;
import cuong.dev.data.driver.MySQLDriver;
import cuong.dev.data.model.Category;

public class CategoryImpl implements CategoryDao {

    @Override
    public boolean insert(Category category) {
        // TODO Auto-generated method stub
        String sql = "INSERT INTO CATEGORIES(NAME,THUMBNAIL) VALUES (?,?)";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.name);
            stmt.setString(2, category.thumbnail);

            stmt.execute();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean update(Category category) {
        // TODO Auto-generated method stub
        String sql = "UPDATE CATEGORIES SET NAME=? ,THUMBNAIL=? WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, category.name);
            stmt.setString(2, category.thumbnail);
            stmt.setInt(3, category.id);

            stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(int id) {
        // TODO Auto-generated method stub
        String sql = "DELETE FROM CATEGORIES WHERE ID=?";
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
    public Category find(int id) {
        // TODO Auto-generated method stub
        String sql = "SELECT * FROM `CATEGORIES` WHERE ID=?";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String thumbnail = rs.getString("thumbnail");
                return new Category(id, name, thumbnail);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        // TODO Auto-generated method stub
        List<Category> categoryList = new ArrayList<>();
        String sql = "SELECT * FROM CATEGORIES";
        try {
            Connection conn = MySQLDriver.getIntance().getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String thumbnail = rs.getString("thumbnail");
                categoryList.add(new Category(id, name, thumbnail));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return categoryList;
    }

}
