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
    private Integer NumberOfBeds;



    @ManyToOne
    private Hotel hotel;

    @ManyToMany
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

    public Room() {

    }

    public Room(String typeOfRoom, BigDecimal price, Integer numberOfBeds, Hotel hotel, List<Resevation> resevationList) {
        TypeOfRoom = typeOfRoom;
        this.price = price;
        NumberOfBeds = numberOfBeds;
        this.hotel = hotel;
        this.resevationList = resevationList;
    }

    public Long getId() {
        return id;
    }

    public String getTypeOfRoom() {
        return TypeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        TypeOfRoom = typeOfRoom;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNumberOfBeds() {
        return NumberOfBeds;
    }

    public void setNumberOfBeds(Integer numberOfBeds) {
        NumberOfBeds = numberOfBeds;
    }
}
