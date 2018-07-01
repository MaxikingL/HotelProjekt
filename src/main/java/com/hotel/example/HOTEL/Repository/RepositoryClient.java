package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryClient {

    @Autowired
    EntityManager em;

    public Client findById(Long id) {
        return em.find(Client.class, id);
    }

    public void deleteById(Long id) {
        Client clientToDelete = findById(id);
        em.remove(clientToDelete);
    }

    public Client save(Client client) {
        if(client.getId()==null)
            em.persist(client);
        else
            em.merge(client);
        return client;
    }

}
