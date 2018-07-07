package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
}
