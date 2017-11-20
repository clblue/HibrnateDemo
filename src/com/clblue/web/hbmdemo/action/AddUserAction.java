package com.clblue.web.hbmdemo.action;

import com.clblue.web.hbmdemo.po.User;
import com.clblue.web.hbmdemo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Date;

public class AddUserAction extends ActionSupport {

    private UserService service;

    private int id;

    private String username;

    private String password;

    private int age;

    private Date birth;

    private String email;

    public UserService getService() {
        return service;
    }

    public void setService(UserService service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String execute() throws Exception {
        User user = new User(getUsername(),getPassword(),getAge(),getBirth(),getEmail());

        if (service.addUser(user)) {
            return SUCCESS;
        }
        addActionError("添加用户失败！");
        return ERROR;
    }
}
