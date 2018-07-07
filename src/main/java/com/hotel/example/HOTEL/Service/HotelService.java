package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryHotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {

    @Autowired
    private RepositoryHotel repositoryHotel;

}
