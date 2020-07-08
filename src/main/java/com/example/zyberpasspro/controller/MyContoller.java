package com.example.zyberpasspro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MyController {

    @RequestMapping("/hi")
    public @ResponseBody
    String hiThere(){
        return "hello world!";
    }
}