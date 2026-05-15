package com.in28minutes.database.database_demo.springdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.database.database_demo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {
	List<Person> findByName(String name);
}
