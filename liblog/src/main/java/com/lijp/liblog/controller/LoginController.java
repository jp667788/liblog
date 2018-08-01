package com.lijp.liblog.controller;

import com.lijp.liblog.bean.LoginUser;
import com.lijp.liblog.bean.ResultMsg;
import com.lijp.liblog.bean.User;
import com.lijp.liblog.service.LoginUserService;
import com.lijp.liblog.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户登录
 *
 * Created by Li on 2018/7/29.
 */
@Controller
@RequestMapping("/loginUser")
public class LoginController {

    @Autowired
    private LoginUserService loginUserService;

    @GetMapping("/toLogin")
    public ModelAndView toLogin(){
        return new ModelAndView("admin/login");

    }

    @PostMapping("/login")
    @ResponseBody
    public ResultMsg<User> login(HttpServletRequest request, LoginUser loginUser){
        ResultMsg<User> result = null;
        if (StringUtils.isEmpty(loginUser.getUserName()) || StringUtils.isEmpty(loginUser.getPassword())) {
            result = new ResultMsg<>("用户名或密码为空！");
            return  result;
        }
        result = loginUserService.loginUser(loginUser.getUserName(), loginUser.getPassword());
        return result;
    }



}
