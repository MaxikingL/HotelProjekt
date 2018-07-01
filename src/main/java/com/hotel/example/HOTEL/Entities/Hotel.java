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

   // public Room getRooms() {
//        return room;
//    }

//    public void setRooms(Room room) {
//        this.room = room;
//    }
}
