package com.clblue.web.hbmdemo.dao;

import com.clblue.web.hbmdemo.po.User;
import dao.DBUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class UserDaoOldImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public void add(User user) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        DBUtils.closeSession(session);
    }

    @Override
    public void update(User user) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        session.update(user);
        session.getTransaction().commit();
        DBUtils.closeSession(session);

    }

    @Override
    public void delete(int id) {
        Session session = getHibernateTemplate().getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "delete User where id=?";
        Query query = session.createQuery(hql);
        query.setInteger(0,id);
        query.executeUpdate();
        session.getTransaction().commit();
        DBUtils.closeSession(session);
    }

    @Override
    public User queryById(int id) {
        return getHibernateTemplate().get(User.class,id);
    }

    @Override
    public List<User> queryAll() {
        return (List<User>) getHibernateTemplate().find("from User");
    }
}
