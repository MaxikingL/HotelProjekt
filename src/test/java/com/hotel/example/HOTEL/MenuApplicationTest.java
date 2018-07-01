package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Menu;
import com.hotel.example.HOTEL.Repository.RepositoryMenu;
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
public class MenuApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryMenu repositoryMenu;

    @Autowired
    EntityManager em;


    public void findById() {
//        Menu menu = repositoryMenu.findById();
//        Assert.assertEquals("",repositoryMenu.findById());

    }

    @Test
    public void DeletById() {
//        repositoryMenu.deleteById();
//        Assert.assertNull("",repositoryMenu.findById(););

    }

    @Test
    public void Save() {

//        Menu menuShouldExist = repositoryMenu.findById();
//        Assert.assertNull(repositoryMenu);
//        Menu newMenu = new Menu();
//        repositoryMenu.save(newMenu);
//        Menu menuAfterInsert = repositoryMenu.findById();

    }
}

