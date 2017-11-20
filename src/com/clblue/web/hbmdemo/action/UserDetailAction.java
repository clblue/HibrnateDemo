package com.clblue.web.hbmdemo.action;

import com.clblue.web.hbmdemo.po.User;
import com.clblue.web.hbmdemo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class UserDetailAction extends ActionSupport {

    private int id;

    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        User user = service.queryUserById(getId());
        ServletActionContext.getRequest().setAttribute("user",user);
        return SUCCESS;

    }
}
