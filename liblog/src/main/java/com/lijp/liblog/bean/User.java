package com.lijp.liblog.bean;

import java.util.Date;

/**
 * 用户实体类
 * Created by Li on 2018/7/29.
 */
public class User {

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 最新登录时间
     */
    private Date loginTime;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
