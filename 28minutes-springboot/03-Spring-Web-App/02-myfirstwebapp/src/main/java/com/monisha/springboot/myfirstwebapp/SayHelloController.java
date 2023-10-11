package com.monisha.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SayHelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello! What are you learning today?";
    }

    @RequestMapping("/hello-html")
    @ResponseBody
    public String hellohtml(){
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>My first html page :-)</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("My first code of HTML in spring");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("/hello-jsp")
//    @ResponseBody
    public String helloJsp(){
        return "sayHello";//file name
    }
}
