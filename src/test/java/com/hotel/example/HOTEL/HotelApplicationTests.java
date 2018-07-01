package com.hotel.example.HOTEL;

import com.hotel.example.HOTEL.Entities.Hotel;
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
import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class HotelApplicationTests {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	RepositoryHotel repositoryHotel;

	@Autowired
	EntityManager em;

	@Test
	public void findById() {
		Hotel hotel = repositoryHotel.findById(10L);
		Assert.assertEquals("Max", hotel.getNameHotel());
	}


}
