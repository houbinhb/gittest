package com.houb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello!");
        return "hello";
    }


    @GetMapping("/employee/basic/hello")
    public String hello2(){
        System.out.println("/employee/basic/hello!");
        return "/employee/basic/hello";
    }


    @GetMapping("/employee/advanced/hello")
    public String hello3(){
        System.out.println("advanced!");
        return "/employee/advanced/hello";
    }


}
