package com.hotel.example.HOTEL.Repository;

import com.hotel.example.HOTEL.Entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class RepositoryPayment {
    @Autowired
    EntityManager em;


    public Payment findById(Long id) {
        return em.find(Payment.class, id);
    }

    public Payment save(Payment payment) {

        if (payment.getId() == null) {
            em.persist(payment);
        } else {
            em.merge(payment);
        }
        return payment;
    }

    public void deleteById(Long id) {
        Payment paymentToDelete = findById(id);
        em.remove(paymentToDelete);
    }
}
