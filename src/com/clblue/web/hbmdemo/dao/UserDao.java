package com.clblue.web.hbmdemo.dao;

import com.clblue.web.hbmdemo.po.User;
import user.Product;

import java.util.List;

public interface UserDao
{
    void add(User user);

    void update(User user);

    void delete(int id);

    User queryById(int id);

    List<User> queryAll();
}
