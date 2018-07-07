package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Resevation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;


@Repository
@Transactional
public class RepositoryReservation {

    @Autowired
    EntityManager em;

    public Resevation findById(Long id) {
        return em.find(Resevation.class, id);
    }

    public Resevation save(Resevation resevation) {

        if (resevation.getId() == null) {
            em.persist(resevation);
        } else {
            em.merge(resevation);

        }
        return resevation;
    }


    public void deleteById(Long id) {
        Resevation resevationToDelete = findById(id);
        em.remove(resevationToDelete);
    }
}