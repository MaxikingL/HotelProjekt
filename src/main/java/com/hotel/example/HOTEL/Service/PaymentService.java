package com.hotel.example.HOTEL.Service;

import com.hotel.example.HOTEL.Repository.RepositoryPayment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private RepositoryPayment repositoryPayment;
}
