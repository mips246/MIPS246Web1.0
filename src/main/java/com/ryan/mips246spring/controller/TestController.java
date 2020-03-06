package com.ryan.mips246spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Ryan
 * @date 2020/3/1 11:09
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(path = "/hello")
    public String hello(){
        return "hello world!";
    }
//    @RequestMapping(path={"/login"},method = {RequestMethod.GET})
//    public String login(){
//        return "login";
//    }
}
