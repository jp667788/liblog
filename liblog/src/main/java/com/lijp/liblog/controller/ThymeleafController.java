package com.lijp.liblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Li on 2018/7/28.
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/test")
    public String test() {
        return "index";
    }
}
