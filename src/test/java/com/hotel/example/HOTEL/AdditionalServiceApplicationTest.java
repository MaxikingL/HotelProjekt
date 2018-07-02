package com.hotel.example.HOTEL;

import com.hotel.example.HOTEL.Entities.AdditionalServices;
import com.hotel.example.HOTEL.Repository.RepositoryAdditionalServices;
import com.hotel.example.HOTEL.Repository.RepositoryClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.CompareTo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AdditionalServiceApplicationTest {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    RepositoryAdditionalServices repositoryAdditionalServices;

    @Autowired
    EntityManager em;

    @Test
    @DirtiesContext
    public void findById(){
        AdditionalServices additionalServices = repositoryAdditionalServices.findById(170L);
        BigDecimal val1=new BigDecimal(50.00);
        BigDecimal val2=additionalServices.getSPA();

       Assert.assertEquals(0,val1.compareTo(val2));

    }
    @Test
    @DirtiesContext
    public void DeletById(){
        repositoryAdditionalServices.deleteById(170L);
        Assert.assertNull(repositoryAdditionalServices.findById(170L));

    }
    @Test
    @DirtiesContext
    public void Save(){

        AdditionalServices additionalServices = repositoryAdditionalServices.findById(180L);
        BigDecimal val3 = new BigDecimal(20.00);
        BigDecimal val4=additionalServices.getGym();
        Assert.assertEquals(0,val3.compareTo(val4));

        BigDecimal val5 = new BigDecimal(123.00);
        additionalServices.setGym(val5);
        repositoryAdditionalServices.save(additionalServices);

        AdditionalServices additionalServices1 = repositoryAdditionalServices.findById(180L);
        Assert.assertEquals(0,val5.compareTo(additionalServices1.getGym()));
    }
}
