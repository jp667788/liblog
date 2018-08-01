package com.lijp.liblog.service;

import com.lijp.liblog.bean.User;

import java.util.List;

/**
 * Created by Li on 2018/7/29.
 */
public interface HelloService {

    List<User> queryByUserList(String userName);

}
