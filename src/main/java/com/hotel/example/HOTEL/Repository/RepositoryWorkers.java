package com.hotel.example.HOTEL.Repository;


import com.hotel.example.HOTEL.Entities.Workers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryWorkers {

    @Autowired
    EntityManager em;

    public Workers findById(Long id) {

        return em.find(Workers.class, id);
    }

    public Workers save(Workers workers) {

        if (workers.getId() == null)
            em.persist(workers);
        else
            em.merge(workers);
        return workers;
    }

    public void deleteById(Long id) {

        Workers workersToDelete = findById(id);
        em.remove(workersToDelete);
    }
}
