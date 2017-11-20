package com.clblue.web.hbmdemo.action;

import com.clblue.web.hbmdemo.po.User;
import com.clblue.web.hbmdemo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport {

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
        User p = new User();
        p.setId(getId());
        if (service.deleteUser(p))
        {
            return SUCCESS;
        }
        addActionError("删除用户失败");
        return ERROR;
    }
}
