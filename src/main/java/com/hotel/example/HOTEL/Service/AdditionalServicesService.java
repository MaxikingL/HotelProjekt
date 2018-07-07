package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryAdditionalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdditionalServicesService {

    @Autowired
    private RepositoryAdditionalServices repositoryAdditionalServices;
}
