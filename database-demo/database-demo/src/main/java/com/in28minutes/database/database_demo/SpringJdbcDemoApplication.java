package com.in28minutes.database.database_demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.in28minutes.database.database_demo.entity.Person;
import com.in28minutes.database.database_demo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("all Person data : {}", dao.findAll());
		logger.info("data of person 10001 : {}", dao.findById(10001));
		logger.info("delete of person 10002 or location is iceLand, the number of deleted row is : {}",
				dao.deleteById(10002, "IceLand"));
		logger.info("inserting 10004 : {}", dao.insert(new Person("udin", "Indonesia", new Date())));
		logger.info("updating 10001 : {}", dao.update(new Person("Ranga", "Italy", new Date())));
	}

}
