package com.umapathy.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.entity.Person;
import com.umapathy.demo.repo.PersonRepo;
@Service

public class PersonService { 
	private final PersonRepo personrepo;
	@Autowired
	public PersonService(PersonRepo personrepo) {
		super();
		this.personrepo = personrepo;
	}

	public List<Person> getPersons(){
		return personrepo.findAll();
	}

	public Person save(Person person) {
		// TODO Auto-generated method stub
		return person;
	}

	
	
	
	
	
	
	

	
	}

	

