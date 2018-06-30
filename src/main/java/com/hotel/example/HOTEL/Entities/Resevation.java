package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Resevation {

    @Id
    @GeneratedValue
    private Long id;

    private String nameHotel;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;



}
