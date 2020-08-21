package com.houb.controller;

import com.houb.model.RespBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
//    @CrossOrigin("*")可以解决跨域，但是不推荐
    public RespBean login(){
        return RespBean.error("尚未登录,请登录！");
    }

}
