package com.hotel.example.HOTEL.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginConfirmationController {



    @RequestMapping("/loginConfirmation")
    public ModelAndView displayLoginConfirmation(){
        return new ModelAndView("pages/loginConfirmation");

    }
    @PostMapping("/addClient")
    public ModelAndView displayAddClient(){
        return new ModelAndView("pages/addClient");
    }


}
