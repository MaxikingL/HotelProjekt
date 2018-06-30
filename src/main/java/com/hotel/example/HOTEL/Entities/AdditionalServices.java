package com.hotel.example.HOTEL.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class AdditionalServices {

    @Id
    @GeneratedValue
    private Long id;

    private BigDecimal swimmingpool;
    private  BigDecimal SPA;
    private  BigDecimal gym;

}
