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

import java.util.Date;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;



    @RequestMapping("/login")
    public ModelAndView displayLogin() {
        return new ModelAndView("pages/loginPage");
    }

//    @PostMapping(value = "/login")
//    public List<Login> listLogin(
//            @RequestParam(value = "login", required = false) Login loginNull,
//            @RequestParam(value = " password", required = false) String passwordNull,
//            @RequestParam(value = "name", required = false) String nameNull,
//            @RequestParam(value = "surname", required = false) String surnameNull,
//            @RequestParam(value = "email", required = false) String emailNull) {
//
//
//
//    return ;}

    @PostMapping("/addLogin")
    public String addLogin(@ModelAttribute LoginDto loginDto){
        loginDto.setPassword("1234");
        loginService.save(loginDto);
        return "pages/addClient";
    }
}
//    @PostMapping("/adduser")
//    public String addUser(@ModelAttribute UserDto userDto){
//        userDto.setJoinDate(new Date());
//        userService.save(userDto);
//        return "usersaveresult";
//    }