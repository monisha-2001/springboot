package com.monisha.springboot.myfirstwebapp;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {

    public boolean authenticate(String username,String password){

        boolean isValidUsername=username.equals("monisha");
        boolean isValidPassword=password.equals("moni");

        return isValidUsername && isValidPassword;
    }
}
