package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 跳转首页Controller
 *
 * @author ：Axel
 * @since ：2020/6/18 19:40
 */
@Controller
public class IndexController {
    @RequestMapping("")
    public String toIndex(){
        return "index";
    }
}
