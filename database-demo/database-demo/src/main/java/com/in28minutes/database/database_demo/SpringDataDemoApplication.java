package com.in28minutes.database.database_demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.database_demo.entity.Person;
import com.in28minutes.database.database_demo.springdata.PersonSpringDataRepository;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonSpringDataRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("data of person 10001 : {}", repository.findById(10001));
//		logger.info("delete of person 10002 or location is iceLand, the number of deleted row is : {}",
//				repository.deleteById(10002, "IceLand"));
		logger.info("inserting 10004 : {}", repository.save(new Person("udin", "Indonesia", new Date())));
		logger.info("updating 10001 : {}", repository.save(new Person(10001, "Ranga", "Italy", new Date())));
		repository.deleteById(10002);
		logger.info("all Person data : {}", repository.findAll());
	}

}
