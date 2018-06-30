package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;




}
