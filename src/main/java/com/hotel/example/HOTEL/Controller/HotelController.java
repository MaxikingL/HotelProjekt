package com.hotel.example.HOTEL.Controller;

import com.hotel.example.HOTEL.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;
}
