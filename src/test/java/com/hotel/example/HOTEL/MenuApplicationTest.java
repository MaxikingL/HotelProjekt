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
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MenuApplicationTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryMenu repositoryMenu;

    @Autowired
    EntityManager em;


    @Test
    @DirtiesContext
    public void findById() {
        Menu menu = repositoryMenu.findById(500L);
        Assert.assertEquals("breakfast",menu.getMeal());

    }

    @Test
    @DirtiesContext
    public void DeletById() {
        repositoryMenu.deleteById(510L);
        Assert.assertNull("lunch-fish",repositoryMenu.findById(510L));

    }

    @Test
    @DirtiesContext
    public void Save() {

        Menu menuShouldExist = repositoryMenu.findById(500L);
        Assert.assertNull(repositoryMenu);
        Menu newMenu = new Menu();
        repositoryMenu.save(newMenu);
        Menu menuAfterInsert = repositoryMenu.findById(500L);

    }
}

