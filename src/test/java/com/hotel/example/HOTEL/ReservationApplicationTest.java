package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Resevation;
import com.hotel.example.HOTEL.Repository.RepositoryReservation;
import com.hotel.example.HOTEL.Repository.RepositoryWorkers;
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
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ReservationApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryReservation repositoryReservation;

    @Autowired
    EntityManager em;

    @Test
    @DirtiesContext
    public void findById(){
        Resevation reservation = repositoryReservation.findById(150L);
        Assert.assertEquals("2018-07-11",reservation.getEndTime());
    }

    @Test
    @DirtiesContext
    public void DeletById(){

        repositoryReservation.deleteById(150L);
        Assert.assertNull(repositoryReservation.findById(150L));
    }
    @Test
    @DirtiesContext
    public void Save(){

        Resevation resevation1 = repositoryReservation.findById(150L);
        Assert.assertEquals("2018-07-11",resevation1.getEndTime());


        //resevation1.setEndTime(2018-07-10);
//        repositoryReservation.save(resevation)

//          Resevation resevationShouldntExist = repositoryReservation.findById();
//        Assert.assertNull(resevationShouldntExists);
//        Resevation newResevation = new Resevation;
//        repositoryReservation.save();
//        Room roomAfterInsert = repositoryRoom.findById();
//        Assert.assertEquals("",roomAfterInsert.findById());
    }
}
