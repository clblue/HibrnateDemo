package com.clblue.web.hbmdemo.action;

import com.clblue.web.hbmdemo.po.User;
import com.clblue.web.hbmdemo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class ShowAllUserAction extends ActionSupport {

    private UserService service;

    public void setService(UserService service) {
        this.service = service;
    }

    @Override
    public String execute() throws Exception {
        List<User> users = service.queryAllUser();
        ServletActionContext.getRequest().setAttribute("allUser",users);

        return SUCCESS;
    }
}
