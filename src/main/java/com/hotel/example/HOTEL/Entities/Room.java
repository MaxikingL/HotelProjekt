package com.hotel.example.HOTEL.Entities;




import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;



    private String TypeOfRoom;
    private BigDecimal price;


    @OneToMany
    private Hotel hotel;

    @ManyToMany
    private Resevation resevation;

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Resevation getResevation() {
        return resevation;
    }

    public void setResevation(Resevation resevation) {
        this.resevation = resevation;
    }
}
