package com.lijp.liblog.controller;

import com.lijp.liblog.bean.User;
import com.lijp.liblog.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Li on 2018/7/28.
 */
@RestController
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private HelloService helloService;

    @GetMapping("/getUserList/{name}")
    public ModelAndView getUserList(@PathVariable(value = "name") String userName, Model model){
        List<User> userList = helloService.queryByUserList(userName);

        model.addAttribute("userList",userList);
        return  new ModelAndView("user/loglist","userModel",model);

    }

}
