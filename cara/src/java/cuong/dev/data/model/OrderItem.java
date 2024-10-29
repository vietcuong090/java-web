package cuong.dev.data.model;

import cuong.dev.data.dao.DatabaseDao;

public class OrderItem {
	public int id;
	public int quantity;
	public double price;
	public int order_id;
	public int product_id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public OrderItem(int quantity, double price, int order_id, int product_id) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.order_id = order_id;
		this.product_id = product_id;
	}
	public OrderItem(int id, int quantity, double price, int order_id, int product_id) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.price = price;
		this.order_id = order_id;
		this.product_id = product_id;
	}
	public Product getProduct(){
            return DatabaseDao.getInstance().getProductDao().find(this.product_id);
        }
        
        public Order getOrder(){
            return DatabaseDao.getInstance().getOrderDao().find(this.order_id);
        }
	

}
