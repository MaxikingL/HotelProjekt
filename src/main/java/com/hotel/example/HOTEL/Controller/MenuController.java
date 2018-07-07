package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MenuController {

    @Autowired
    private MenuService menuService;
}
