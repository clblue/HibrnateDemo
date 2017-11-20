package dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import user.Product;

import java.util.List;

public class ProductDaoOldImpl extends HibernateDaoSupport implements ProductDao {


    @Override
    public void add(Product product) {
        System.out.println("添加"+product);
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        session.save(product);
        session.getTransaction().commit();
        DBUtils.closeSession(session);
    }

    @Override
    public void update(Product product) {
        System.out.println("更新"+product);
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        session.update(product);
        session.getTransaction().commit();
        DBUtils.closeSession(session);

    }

    @Override
    public void delete(String id) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "delete Product where id=?";
        Query query = session.createQuery(hql);
        query.setString(0,id);
        query.executeUpdate();
        session.getTransaction().commit();
        DBUtils.closeSession(session);
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
