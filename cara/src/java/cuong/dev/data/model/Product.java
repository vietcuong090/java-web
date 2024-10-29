package cuong.dev.data.model;

import java.sql.Timestamp;

public class Product {

    public int id;
    public String name;
    public String description;
    public double price;
    public int quantity;
    public String thumbnail;
    public int view;
    public int category_id;
    public int product_id;
    public Timestamp created_at;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Timestamp getCreate_at() {
        return created_at;
    }

    public void setCreate_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Product(String name, String description, double price, int quantity, String thumbnail, int view,
            int category_id, Timestamp created_at) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.thumbnail = thumbnail;
        this.view = view;
        this.category_id = category_id;
        this.created_at = created_at;
    }

    public Product(int id, String name, String description, double price, int quantity, String thumbnail, int view,
            int category_id, Timestamp created_at) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.thumbnail = thumbnail;
        this.view = view;
        this.category_id = category_id;
        this.created_at = created_at;
    }

    public Product(int id, String name, String description, double price, int quantity, String thumbnail, int view,
            int category_id) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.thumbnail = thumbnail;
        this.view = view;
        this.category_id = category_id;
    }

}
