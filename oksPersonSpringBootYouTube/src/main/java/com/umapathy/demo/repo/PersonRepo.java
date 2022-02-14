package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.entity.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person, Integer>{
	
	//Optional<Person>findPersonByEmail(String email);
	

}
