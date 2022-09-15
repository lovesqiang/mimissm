package com.qiang.controller;

import com.qiang.pojo.Admin;
import com.qiang.service.AdmainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminAction {

    @Autowired
    private AdmainService admainService;

    @RequestMapping("/login")
    public String adminAction(String name, String pwd, HttpServletRequest request){

        Admin admin = admainService.login(name, pwd);

        if(admin!=null){
            request.setAttribute("admin",admin);
            return "main";
        }else {
            request.setAttribute("errmsg","用户名或密码错误");
            return "login";
        }

    }

}
