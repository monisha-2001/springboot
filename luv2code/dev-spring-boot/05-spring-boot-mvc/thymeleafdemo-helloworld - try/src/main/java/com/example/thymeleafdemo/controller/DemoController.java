package com.example.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/hello")
    public String getHello(Model theModel){
        theModel.addAttribute("date",new java.util.Date());

        return "helloworld";
    }


}
