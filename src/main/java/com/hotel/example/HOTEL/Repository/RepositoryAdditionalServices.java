package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.AdditionalServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryAdditionalServices {

    @Autowired
    EntityManager em;

    public AdditionalServices findById(Long id){
        return em.find(AdditionalServices.class, id);
    }

    public void deleteById(Long id) {
        AdditionalServices additionalServicesToDelete = findById(id);
        em.remove(additionalServicesToDelete);
    }

    public AdditionalServices save(AdditionalServices additionalServices) {
        if(additionalServices.getId()==null)
            em.persist(additionalServices);
        else
            em.merge(additionalServices);
        return additionalServices;
    }

}
