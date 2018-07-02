package com.hotel.example.HOTEL;

import com.hotel.example.HOTEL.Entities.Room;
import com.hotel.example.HOTEL.Repository.RepositoryRoom;
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
public class RoomApplicationTest {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryRoom repositoryRoom;

    @Autowired
    EntityManager em;


    @Test
    @DirtiesContext
    public void findById(){

        Room room = repositoryRoom.findById(1000L);
        Assert.assertEquals("one bed",room.getTypeOfRoom());

    }
    @Test
    @DirtiesContext
    public void DeletById(){
        repositoryRoom.deleteById(2000L);
        Assert.assertNull(repositoryRoom.findById(2000L));

    }
    @Test
    @DirtiesContext
    public void Save(){

        Room room = repositoryRoom.findById(3000L);
        Assert.assertEquals("three beds",room.getTypeOfRoom());

        room.setTypeOfRoom("three beds-Test");
        repositoryRoom.save(room);

        Room room1 = repositoryRoom.findById(3000L);
        Assert.assertEquals("three beds-Test",room1.getTypeOfRoom());


    }
}
