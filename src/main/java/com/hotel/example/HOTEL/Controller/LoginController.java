package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Dto.LoginDto;
import com.hotel.example.HOTEL.Entities.Login;
import com.hotel.example.HOTEL.Service.LoginService;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;


    @RequestMapping("/login")
    public ModelAndView displayLogin() {
        return new ModelAndView("pages/loginPage");
    }

//addLogin
    @PostMapping("/addLogin")
    public String addLogin(
            @RequestParam(value = "password", required = false) String passwordNull,
            @RequestParam(value = "name", required = false) String nameNull,
            @RequestParam(value = "surname", required = false) String surnameNull,
            @RequestParam(value = "email", required = false) String emailNull) {


        loginService.save(new LoginDto(emailNull, nameNull, surnameNull, passwordNull));
        return "pages/loginConfirmation";
    }
}

