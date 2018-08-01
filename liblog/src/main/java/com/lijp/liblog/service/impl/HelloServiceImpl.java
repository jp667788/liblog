package com.lijp.liblog.service.impl;

import com.lijp.liblog.bean.User;
import com.lijp.liblog.dao.mapper.UserMapper;
import com.lijp.liblog.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li on 2018/7/29.
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> queryByUserList(String userName) {
        return userMapper.queryUserListByUserName(userName);
    }
}
