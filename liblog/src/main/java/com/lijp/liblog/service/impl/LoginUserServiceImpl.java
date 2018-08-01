package com.lijp.liblog.service.impl;

import com.lijp.liblog.bean.ResultMsg;
import com.lijp.liblog.bean.User;
import com.lijp.liblog.dao.mapper.LoginUserMapper;
import com.lijp.liblog.service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Li on 2018/7/29.
 */
@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    private LoginUserMapper loginUserMapper;

    @Override
    public ResultMsg<User> loginUser(String userName, String password) {
        ResultMsg<User> result = new ResultMsg<>();
        User user = loginUserMapper.queryUserByNameAndPassword(userName, password);
        if (user == null) {
            result.setErrorMsg("用户名或密码输入错误！");
            return result;
        }
        // TODO 如果点击记住我 设置Session 或者redis记录状态

        // 更新用户登录时间，记录日志。
        result.setObj(user);
        result.setSuccess(true);
        return result;
    }
}
