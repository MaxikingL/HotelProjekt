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
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoomApplicationTest {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryRoom repositoryRoom;

    @Autowired
    EntityManager em;


    public void findById(){

//        Room room = repositoryRoom.findById();
//        Assert.assertEquals("",room.getId());

    }
    @Test
    public void DeletById(){
//        repositoryRoom.deleteById();
//        Assert.assertNull(repositoryRoom.findById());

    }
    @Test
    public void Save(){
//        Room roomShouldntExists = repositoryRoom.findById();
//        Assert.assertNull(roomShouldntExists);
//        Room newRoom = new Room();
//        repositoryRoom.save();
//        Room roomAfterInsert = repositoryRoom.findById();
//        Assert.assertEquals("",roomAfterInsert.findById());

    }
}
