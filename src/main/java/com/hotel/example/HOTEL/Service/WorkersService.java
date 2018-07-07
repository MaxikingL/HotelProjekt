package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryWorkers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class WorkersService {

    @Autowired
    private RepositoryWorkers repositoryWorkers;

    @Autowired
    private ModelMapper modelMapper;

}
