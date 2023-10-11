package com.monisha.springboot.myfirstwebapp.login;

import com.monisha.springboot.myfirstwebapp.LoginAuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private LoginAuthenticationService authenticationService;

    public LoginController(LoginAuthenticationService authenticationService){
        this.authenticationService=authenticationService;
    }

    //to open login page
    @RequestMapping(value="login",method = RequestMethod.GET)
    public String gotologinpage(){
        return "login";   //file name
    }

    @RequestMapping(value="login",method = RequestMethod.POST)  //url remains same i.e login
    public String gotowelcomepage(
            @RequestParam String name, @RequestParam String password, ModelMap model){

        if(authenticationService.authenticate(name,password)){
            model.put("nameused",name);//("nameused",monisha)
            return "welcome";   //file name
        }
        model.put("errormessage","INVALID CREDENTIALS");
        return "login";


    }
}
