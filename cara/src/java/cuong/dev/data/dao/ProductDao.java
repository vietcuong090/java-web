package cuong.dev.data.dao;

import java.util.List;

import cuong.dev.data.model.Product;

public interface ProductDao {

    public boolean insert(Product product);

    public boolean update(Product product);

    public boolean delete(int id);

    public Product find(int id);

    public List<Product> findAll();

    public List<Product> hot(int limit);

    public List<Product> news(int limit);

    public List<Product> finByCategory(int limit);

    public List<Product> finByName(String key);

    public List<Product> finByCategoryOfName(int categoryId, String key);
    
    public List<Product> filter(int categoryId, String propertyName, String order);

    public List<Product> relatedProducList(Product product);
    
    public List<Product> getProducts(int form, int amout);
    


    public boolean updateView(Product product);
    
}
