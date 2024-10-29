package cuong.dev.data.dao;

import java.util.List;

import cuong.dev.data.model.OrderItem;

public interface OrderItemDao {

    public boolean insert(OrderItem orderitem);

    public boolean update(OrderItem orderitem);

    public boolean delete(int id);

    public OrderItem find(int id);

    public List<OrderItem> findAll();

    public List<OrderItem> findByOder(int id);

    public List<OrderItem> findByProduct(int id);

}
