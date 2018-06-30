package com.hotel.example.HOTEL.Entities;




import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Room {

    @Id
    @GeneratedValue
    private Long id;



    private String TypeOfRoom;
    private BigDecimal price;


    @OneToMany
    private Hotel hotel;

    @ManyToMany(mappedBy = "reservation")
    private List<Resevation> resevationList = new ArrayList<>();

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public List<Resevation> getResevationList() {
        return resevationList;
    }

    public void setResevationList(List<Resevation> resevationList) {
        this.resevationList = resevationList;
    }
}
