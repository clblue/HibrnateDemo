package action;

import com.opensymphony.xwork2.ActionSupport;
import service.ProductService;
import service.ServiceFactory;
import user.Product;

public class UpdateAction extends ActionSupport {
    private String id;

    private String name;

    private double price;

    private ProductService service;

    public void setService(ProductService service) {
        this.service = service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String execute() throws Exception {
        service.updateProduct(new Product(getId(),getName(),getPrice()));
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "addAction{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
