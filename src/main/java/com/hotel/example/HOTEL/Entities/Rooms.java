package com.hotel.example.HOTEL.Entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}
