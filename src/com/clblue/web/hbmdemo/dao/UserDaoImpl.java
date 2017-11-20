package com.clblue.web.hbmdemo.dao;

import com.clblue.web.hbmdemo.po.User;
import dao.ProductDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import user.Product;

import java.util.List;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {


    @Override
    public void add(User user) {
        getHibernateTemplate().save(user);
    }

    @Override
    public void update(User user) {
        getHibernateTemplate().merge(user);
    }

    @Override
    public void delete(int id) {
        getHibernateTemplate().delete(getHibernateTemplate().get(User.class,id));
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
