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
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class WorkersApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryWorkers repositoryWorkers;

    @Autowired
    EntityManager em;

    @Test
    @DirtiesContext
    public void findById(){
        Workers workers = repositoryWorkers.findById(900L);
        Assert.assertEquals("Walt",workers.getName());

    }
    @Test
    @DirtiesContext
    public void DeletById(){

        repositoryWorkers.deleteById(910L);
        Assert.assertNull(repositoryWorkers.findById(910L));
    }
    @Test
    @DirtiesContext
    public void Save(){

        Workers workers = repositoryWorkers.findById(900L);
        Assert.assertEquals("Walt",workers.getName());

        workers.setName("Walt-Test");
        repositoryWorkers.save(workers);

        Workers workers1 = repositoryWorkers.findById(900L);
        Assert.assertEquals("Walt-Test",workers1.getName());

    }
}
