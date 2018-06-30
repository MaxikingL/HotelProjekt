package com.hotel.example.HOTEL.Entities;




import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Rooms {

    @Id
    @GeneratedValue
    private Long id;



    private String TypeOfRoom;
    private BigDecimal price;


    @OneToMany
    private Hotel hotel;

    @ManyToOne
    private Resevation resevation;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
