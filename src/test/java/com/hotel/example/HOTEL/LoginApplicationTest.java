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
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginApplicationTest {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryLogin repositoryLogin;

    @Autowired
    EntityManager em;

    public void findById(){
        Login login = repositoryLogin.findById(11L);
        Assert.assertEquals("Kolonko", login.getSurname());

    }
    @Test
    public void DeletById(){
        repositoryLogin.deleteById(11L);
        Assert.assertNull(repositoryLogin.findById(11L));

    }
    @Test
    public void Save(){
        Login loginShouldExist = repositoryLogin.findById(11L);
        Assert.assertNull(loginShouldExist);
        Login newLogin = new Login("max@gmail.com","Max", "Kolonko", "abc");
        repositoryLogin.save(newLogin);
        Login loginAfterInsert = repositoryLogin.findById(11L);

    }
}
