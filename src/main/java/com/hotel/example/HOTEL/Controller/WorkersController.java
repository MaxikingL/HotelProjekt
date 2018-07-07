package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.WorkersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WorkersController {

    @Autowired
    private WorkersService workersService;
}
