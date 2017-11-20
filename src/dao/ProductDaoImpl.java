package dao;

import org.hibernate.Session;
import org.springframework.beans.BeanUtils;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import user.Product;

import java.util.List;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {


    @Override
    public void add(Product product) {
        getHibernateTemplate().save(product);
    }

    @Override
    public void update(Product product) {
        getHibernateTemplate().merge(product);
    }

    @Override
    public void delete(String id) {
        getHibernateTemplate().delete(getHibernateTemplate().get(Product.class,id));
    }

    @Override
    public Product queryById(String id) {
        return getHibernateTemplate().get(Product.class,id);
    }

    @Override
    public List<Product> queryAll() {
        return (List<Product>) getHibernateTemplate().find("from Product");
    }
}
