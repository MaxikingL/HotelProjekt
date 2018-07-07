package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;
}
