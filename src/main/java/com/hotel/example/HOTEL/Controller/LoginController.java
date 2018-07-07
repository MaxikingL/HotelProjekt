package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("/login")
    public String displayLogin(){
        return "login";
    }
}
