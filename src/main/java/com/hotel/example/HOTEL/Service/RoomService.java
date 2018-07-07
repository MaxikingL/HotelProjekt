package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryRoom;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RepositoryRoom repositoryRoom;
    @Autowired
    private ModelMapper modelMapper;
}
