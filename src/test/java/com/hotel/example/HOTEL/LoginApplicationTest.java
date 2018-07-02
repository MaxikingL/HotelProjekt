package com.hotel.example.HOTEL;


import com.hotel.example.HOTEL.Entities.Login;
import com.hotel.example.HOTEL.Repository.RepositoryLogin;
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
public class LoginApplicationTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryLogin repositoryLogin;

    @Autowired
    EntityManager em;

    @Test
    @DirtiesContext
    public void findById(){
        Login login = repositoryLogin.findById(21L);
        Assert.assertEquals("Trump", login.getSurname());

    }
    @Test
    @DirtiesContext
    public void DeletById(){
        repositoryLogin.deleteById(11L);
        Assert.assertNull(repositoryLogin.findById(11L));

    }
    @Test
    @DirtiesContext
    public void Save(){
        Login loginShouldExist = repositoryLogin.findById(11L);
        Assert.assertNull(loginShouldExist);
        Login newLogin = new Login("max@gma1il.com","Max", "Kolonko", "abc");
        repositoryLogin.save(newLogin);
        Login loginAfterInsert = repositoryLogin.findById(11L);

    }
}
