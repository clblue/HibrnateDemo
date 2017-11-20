package com.clblue.web.hbmdemo.service;

import com.clblue.web.hbmdemo.po.User;
import user.Product;

import java.util.List;

public interface UserService
{
    boolean addUser(User user);

    boolean deleteUser(User user);

    boolean updateUser(User user);

    User queryUserById(int id);

    List<User> queryAllUser();
}
