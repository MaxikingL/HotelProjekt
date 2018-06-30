package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Login {


    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String name;
    private String surname;
    private String password;
}
