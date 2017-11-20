import dao.DBUtils;
import org.hibernate.Session;
import user.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //TODO:配置文件
        Session session = DBUtils.getSession();
        session.beginTransaction();
        Product product = new Product("23","rice",12.5);
        session.save(product);
        session.getTransaction().commit();
        DBUtils.closeSession(session);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
