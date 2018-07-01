package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryLogin {

    @Autowired
    EntityManager em;

    public Login findById(Long id) {
        return em.find(Login.class, id);
    }

    public void deleteById(Long id) {
        Login loginToDelete = findById(id);
        em.remove(loginToDelete);
    }

    public Login save(Login login) {
        if(login.getId()==null)
            em.persist(login);
        else
            em.merge(login);
        return login;
    }

}
