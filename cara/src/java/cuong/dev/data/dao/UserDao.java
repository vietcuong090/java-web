package cuong.dev.data.dao;

import java.util.List;

import cuong.dev.data.model.User;

public interface UserDao {
	public boolean insert( User user );
	public boolean update(User user);
	public boolean delete(int id);
	public User find(int id);
	public List<User> findAll();
        public User find(String email);
        public User find(String email, String password);
        

}
