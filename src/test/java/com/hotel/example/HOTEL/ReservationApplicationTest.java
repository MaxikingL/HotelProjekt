package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Resevation;
import com.hotel.example.HOTEL.Repository.RepositoryReservation;
import com.hotel.example.HOTEL.Repository.RepositoryWorkers;
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
public class ReservationApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryReservation repositoryReservation;

    @Autowired
    EntityManager em;

    public void findById(){
//        Resevation reservation = repositoryReservation.findById();
//        Assert.assertEquals("Andrzej",reservation.getId());
    }
    @Test
    public void DeletById(){

        //        repositoryReservation.deleteById();
//        Assert.assertNull(repositoryReservation.findById());
    }
    @Test
    public void Save(){
//          Resevation resevationShouldntExist = repositoryReservation.findById();
//        Assert.assertNull(resevationShouldntExists);
//        Resevation newResevation = new Resevation;
//        repositoryReservation.save();
//        Room roomAfterInsert = repositoryRoom.findById();
//        Assert.assertEquals("",roomAfterInsert.findById());
    }
}
