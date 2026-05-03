package com.in28minutes.database.database_demo.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.database_demo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entityManager;

	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}

}
