package com.hotel.example.HOTEL.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Hotel {



    @Id
    @GeneratedValue
    private Long id;


    @OneToMany
    private List<Room> rooms = new ArrayList<>();

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
