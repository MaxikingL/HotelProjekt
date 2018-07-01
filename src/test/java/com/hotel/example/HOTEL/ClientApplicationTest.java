package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Client;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
import com.hotel.example.HOTEL.Repository.RepositoryHotel;
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
public class ClientApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryClient repositoryClient;

    @Autowired
    EntityManager em;


    @Test
    public void findById(){
//        Client client = repositoryClient.findById();
//        Assert.assertEquals("",client.getName());

    }
    @Test
    public void DeletById(){
//        repositoryClient.deleteById();
//        Assert.assertNull(repositoryClient.findById());

    }
    @Test
    public void Save(){
//        Client clientShouldntExists = repositoryClient.findById();
//        Assert.assertNull(clientShouldntExists);
//        Client newClient = new Client();
//        repositoryClient.save();
//        Client clientAfterInsert = repositoryClient.findById();
//        Assert.assertEquals("",clientAfterInsert.getName());
    }

}
