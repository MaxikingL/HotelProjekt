package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @RequestMapping("/addClient")
    public ModelAndView displayClient(){
        return new ModelAndView("pages/addClient");
    }
}
