package com.clblue.web.hbmdemo.service;

import com.clblue.web.hbmdemo.dao.UserDao;
import com.clblue.web.hbmdemo.po.User;

import java.util.List;

public class UserServiceImpl implements UserService
{
    private UserDao dao;

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public boolean addUser(User user) {
        if(user == null)
        {
            return false;
        }
        if(dao.queryById(user.getId())== null)
        {
            dao.add(user);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean deleteUser(User user) {
        if(user == null)
        {
            return false;
        }
        if(dao.queryById(user.getId())!= null)
        {
            dao.delete(user.getId());
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public boolean updateUser(User user) {
        if(user == null)
        {
            return false;
        }
        if(dao.queryById(user.getId())!= null)
        {
            dao.update(user);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public User queryUserById(int id) {
        return dao.queryById(id);
    }

    @Override
    public List<User> queryAllUser() {
        return dao.queryAll();
    }
}
