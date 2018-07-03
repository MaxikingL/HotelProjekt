package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Payment;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
import com.hotel.example.HOTEL.Repository.RepositoryPayment;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class PaymentApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryPayment repositoryPayment;

    @Autowired
    EntityManager em;

    @Test
    public void findById() {
          Payment payment = repositoryPayment.findById(120L);
          Assert.assertEquals(false,payment.isStatusPayment());

    }

    @Test
    @DirtiesContext
    public void DeleteById() {

          repositoryPayment.deleteById(120L);
          Assert.assertNull(repositoryPayment.findById(120L));


    }

    @Test
    public void Save() {
          Payment paymentStatus = repositoryPayment.findById(120L);
          Assert.assertEquals(false,paymentStatus.isStatusPayment());
          paymentStatus.setStatusPayment(true);
          repositoryPayment.save(paymentStatus);
          Payment paymentAfterInsert = repositoryPayment.findById(120L);
          Assert.assertEquals(true,paymentAfterInsert.isStatusPayment());

    }
}

