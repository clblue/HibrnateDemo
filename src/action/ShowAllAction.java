package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.ProductService;
import service.ServiceFactory;
import user.Product;

import java.util.List;

public class ShowAllAction extends ActionSupport {

    private ProductService service;

    public void setService(ProductService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        List<Product> products = service.queryAllProduct();
        ServletActionContext.getRequest().setAttribute("all_product",products);

        return SUCCESS;
    }
}
