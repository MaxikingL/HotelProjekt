package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryReservation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResevationService {

    @Autowired
    private RepositoryReservation repositoryReservation;
    @Autowired
    private ModelMapper modelMapper;
}
