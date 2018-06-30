package com.hotel.example.HOTEL.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Hotel {



    @Id
    @GeneratedValue
    private Long id;


    @OneToMany(mappedBy = "hotel")
    private Room room;

    public Room getRooms() {
        return room;
    }

    public void setRooms(Room room) {
        this.room = room;
    }
}
