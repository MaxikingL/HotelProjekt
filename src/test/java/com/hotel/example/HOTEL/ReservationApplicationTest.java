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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
        String date = "2018-07-11 00:00:00.0";
        Assert.assertEquals(date, reservation.getEndTime().toString());


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

        Resevation resevation = new Resevation(new Date("2018-07-11"), new Date ("2019-01-01"));
        repositoryReservation.save(resevation);

        Resevation resevation1 = repositoryReservation.findById(150L);
        Assert.assertEquals(new Date("2018-07-11"), new Date ("2019-01-01").getTime());



//        Assert.assertEquals("2018-07-11",resevation.getEndTime());



//        resevation.setEndTime(this.);
//        repositoryReservation.save(resevation)

//          Resevation resevationShouldntExist = repositoryReservation.findById();
//        Assert.assertNull(resevationShouldntExists);
//        Resevation newResevation = new Resevation;
//        repositoryReservation.save();
//        Room roomAfterInsert = repositoryRoom.findById();
//        Assert.assertEquals("",roomAfterInsert.findById());
    }
}
