package com.lijp.liblog.service;

import com.lijp.liblog.bean.ResultMsg;
import com.lijp.liblog.bean.User;

/**
 * Created by Li on 2018/7/29.
 */
public interface LoginUserService {

    /**
     * 用户登录
     * @param userName
     *          用户名
     * @param password
     *          密码
     * @return
     */
    ResultMsg<User> loginUser(String userName, String password);
}
