package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryClient;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    private RepositoryClient repositoryClient;
    @Autowired
    private ModelMapper modelMapper;

}
