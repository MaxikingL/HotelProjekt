package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryMenu;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private RepositoryMenu repositoryMenu;
    @Autowired
    private ModelMapper modelMapper;
}
