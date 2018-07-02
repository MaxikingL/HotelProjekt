package com.hotel.example.HOTEL;

import com.hotel.example.HOTEL.Entities.Hotel;
import com.hotel.example.HOTEL.Repository.RepositoryHotel;
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
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HotelApplicationTests {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryHotel repositoryHotel;

    @Autowired
    EntityManager em;

    @Test
    @DirtiesContext
    public void findById_Basic() {
        Hotel hotel = repositoryHotel.findById(10L);
        Assert.assertEquals("Max", hotel.getNameHotel());
    }

    @Test
    @DirtiesContext
    public void DeletById_Basic() {
        repositoryHotel.deleteById(10L);
        Assert.assertNull(repositoryHotel.findById(10L));
    }

    @Test
    @DirtiesContext
    public void Save() {

        Hotel hotel = repositoryHotel.findById(20L);
        Assert.assertEquals("Mal", hotel.getNameHotel());

        hotel.setNameHotel("Mal-Test");
        repositoryHotel.save(hotel);

        Hotel hotell = repositoryHotel.findById(20L);
        Assert.assertEquals("Mal-Test", hotell.getNameHotel());


    }
}