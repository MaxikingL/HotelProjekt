package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Client;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
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

import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class ClientApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryClient repositoryClient;

    @Autowired
    EntityManager em;


    @Test
    @DirtiesContext
    public void findById(){
        Client client = repositoryClient.findById(200L);
        Assert.assertEquals("Trump",client.getSurname());

    }
    @Test
    @DirtiesContext
    public void DeletById_basic(){
        repositoryClient.deleteById(200L);
        assertNull(repositoryClient.findById(200L));

    }
    @Test
    @DirtiesContext
    public void Save_Client(){

        Client client = repositoryClient.findById(200L);
        Assert.assertEquals("Trump",client.getSurname());

        client.setSurname("Trump-Test");
        repositoryClient.save(client);

        Client client1 = repositoryClient.findById(200L);
        Assert.assertEquals("Trump-Test",client1.getSurname());

    }

}
