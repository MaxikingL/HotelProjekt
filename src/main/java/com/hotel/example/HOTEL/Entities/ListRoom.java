package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class ListRoom {


    @Id
    @GeneratedValue
    private Long id;



    private String Type;
}
