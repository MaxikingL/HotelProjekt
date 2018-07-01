package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryHotel {

    @Autowired
    EntityManager em;

    public Hotel findById(Long id) {
        return em.find(Hotel.class, id);
    }

    public void deleteById(Long id) {
        Hotel hotelToDelete = findById(id);
        em.remove(hotelToDelete);
    }

    public Hotel save(Hotel hotel) {
        if(hotel.getId()==null)
            em.persist(hotel);
        else
            em.merge(hotel);
        return hotel;
    }
}
