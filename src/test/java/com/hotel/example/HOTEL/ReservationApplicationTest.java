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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
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
    public void findById() {
        Resevation reservation = repositoryReservation.findById(150L);
        String date = "2018-07-11 00:00:00.0";
        Assert.assertEquals(date, reservation.getEndTime().toString());


    }


    @Test
    @DirtiesContext
    public void DeletById() {

        repositoryReservation.deleteById(150L);
        Assert.assertNull(repositoryReservation.findById(150L));
    }

    @Test
    @DirtiesContext
    public void Save() throws ParseException {
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateformat.parse("17/07/1989");
        Date date2 = dateformat.parse("18/08/1989");

        Resevation resevation = new Resevation(date1, date2);
        repositoryReservation.save(resevation);

        Resevation resevation1 = repositoryReservation.findById(resevation.getId());


        Assert.assertEquals("17/07/1989", dateformat.format(resevation1.getStartTime()).toString());
    }
}
