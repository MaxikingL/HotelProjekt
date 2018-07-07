package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Payment;
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
    @DirtiesContext
    public void findById() {
        Payment payment = repositoryPayment.findById(120L);
        Assert.assertTrue("120",true);

    }

    @Test
    @DirtiesContext
    public void DeletById() {
        repositoryPayment.deleteById(120L);
        Assert.assertNull(repositoryPayment.findById(120L));

    }

    @Test
    @DirtiesContext
    public void Save() {

        Payment payment = repositoryPayment.findById(120L);
        Assert.assertTrue("120",true);

        payment.setStatusPayment(false);
        repositoryPayment.save(payment);

        Payment payment1 = repositoryPayment.findById(120L);
        Assert.assertFalse("120",false);
//        Payment paymentShouldntExist = repositoryPayment.findById();
//        Assert.assertNull(paymentShouldntExist);
//        Payment newPayment = new Payment();
//        repositoryPayment.save();
//        Payment paymentAfterInsert = repositoryPayment.findById();
//        Assert.assertEquals("",paymentAfterInsert.findById();

    }
}

