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
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryPayment repositoryPayment;
    @Autowired
    EntityManager em;


    public void findById() {
//        Payment payment = repositoryPayment.findById();
//        Assert.assertEquals("",payment.getId());

    }

    @Test
    public void DeletById() {
//        repositoryPayment.deleteById();
//        Assert.assertNull(repositoryPayment.findById());

    }

    @Test
    public void Save() {
//        Payment paymentShouldntExist = repositoryPayment.findById();
//        Assert.assertNull(paymentShouldntExist);
//        Payment newPayment = new Payment();
//        repositoryPayment.save();
//        Payment paymentAfterInsert = repositoryPayment.findById();
//        Assert.assertEquals("",paymentAfterInsert.findById();

    }
}

