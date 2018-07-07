package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private RepositoryLogin repositoryLogin;
}
