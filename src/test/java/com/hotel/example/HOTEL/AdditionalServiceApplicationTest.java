package com.hotel.example.HOTEL;

import com.hotel.example.HOTEL.Entities.AdditionalServices;
import com.hotel.example.HOTEL.Repository.RepositoryAdditionalServices;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
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
public class AdditionalServiceApplicationTest {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryAdditionalServices repositoryAdditionalServices;

    @Autowired
    EntityManager em;

    public void findById(){
//        AdditionalServices additionalServices = repositoryAdditionalServices.findById();
//        Assert.assertEquals("",additionalServices.getId());

    }
    @Test
    public void DeletById(){
//        repositoryAdditionalServices.deleteById();
//        Assert.assertNull(repositoryAdditionalServices.findById());

    }
    @Test
    public void Save(){
//        AdditionalServices additionalServicesShouldntExists = repositoryAdditionalServices.findById();
//        Assert.assertNull(additionalServicesShouldntExists);
//        AdditionalServices newAdditionalService = new AdditionalServices();
//        repositoryAdditionalServices.save();
//        AdditionalServices AdditionalServiceAfterInsert = repositoryAdditionalServices.findById();
//        Assert.assertEquals("",AdditionalServiceAfterInsert.getId());   nie wiem czy tu ma byc .getId() i w pozostałych testach co ma byc wpisane. Sprawdz prosze
    }
}
