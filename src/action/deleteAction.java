package action;

import com.opensymphony.xwork2.ActionSupport;
import service.ProductService;
import service.ServiceFactory;
import user.Product;

public class deleteAction extends ActionSupport {

    private String id;

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

    @Override
    public String execute() throws Exception {
        Product p = new Product();
        p.setId(getId());
        service.deleteProduct(p);
        return SUCCESS;
    }
}
