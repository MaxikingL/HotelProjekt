package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Hotel {



    @Id
    @GeneratedValue
    private Long id;

    
    private String nameHotel;

    @OneToMany
    private List<Room> rooms = new ArrayList<>();

    protected Hotel(){

    }
    public Hotel(String nameHotel, List<Room> rooms) {
        this.nameHotel = nameHotel;
        this.rooms = rooms;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public Long getId() {
        return id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nameHotel='" + nameHotel + '\'' +
                ", rooms=" + rooms +
                '}';
    }
}
