package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.ResevationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ResevationController {

    @Autowired
    private ResevationService resevationService;
}
