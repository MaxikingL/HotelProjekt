package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@Repository
@Transactional
public class RepositoryRoom {

    @Autowired
    EntityManager em;

    public Room findById(Long id) {

        return em.find(Room.class, id);
    }

    public Room save(Room room) {

        if (room.getId() == null)
            em.persist(room);
        else
            em.merge(room);
        return room;
    }

    public void deleteById(Long id) {

        Room roomToDelete = findById(id);
        em.remove(roomToDelete);
    }

}
