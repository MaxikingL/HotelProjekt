package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Workers;
import com.hotel.example.HOTEL.Repository.RepositoryWorkers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkersApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryWorkers repositoryWorkers;

    @Autowired
    EntityManager em;

    @Test
    public void findById(){
//        Workers workers = repositoryWorkers.findById();
//        Assert.assertEquals("Andrzej",workers.getName());

    }
    @Test
    public void DeletById(){

//        repositoryWorkers.deleteById();
//        Assert.assertNull(repositoryWorkers.findById());
    }
    @Test
    public void Save(){
//        Workers workersShouldntExists = repositoryWorkers.findById();
//        Assert.assertNull(workersShouldntExists);
//        Workers newWorkers = new Workers;
//        repositoryWorkers.save();
//        Workers workersAfterInsert = repositoryWorkers.findById();
//        Assert.assertEquals("",workersAfterInsert.getTypeOfRoom());
    }
}
