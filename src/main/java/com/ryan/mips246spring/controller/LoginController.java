package com.ryan.mips246spring.controller;

import com.ryan.mips246spring.biz.LoginBiz;
import com.ryan.mips246spring.model.Admin;
import com.ryan.mips246spring.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Ryan
 * @date 2020/3/1 13:54
 */
@Controller
public class LoginController {
    @Autowired
    private LoginBiz loginBiz;
    @Autowired
    private AdminService adminService;
    @RequestMapping(path = {"/login"},method = {RequestMethod.GET})
    public String login(){
        return "public/login";
    }
    @RequestMapping(path = {"/users/login/do"},method = {RequestMethod.POST})
    public String doLogin(
            Model model,
            HttpServletResponse response,
            @RequestParam("role") String role,
            @RequestParam("userid") String userid,
            @RequestParam("userpass") String userpass
    ){
        System.out.println("进入登录检测："+role+" "+userid+" "+userpass);
        if(loginBiz.login(userid,userpass,role)){
            Admin admin = adminService.getAdmin(userid);
            model.addAttribute("admin",admin);
            return "admin/adminmain";
        }else{
            return "public/errorpage";
        }
    }
}
