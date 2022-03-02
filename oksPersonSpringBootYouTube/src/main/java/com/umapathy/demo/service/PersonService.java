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
	
	public void add(Person person) {
		personrepo.save(person);
	}
	public List<Person>show(){
		return personrepo.findAll();
	}
	public void update(Person person) {
		personrepo.save(person);
	}
	
	public void delete(Person person) {
		personrepo.delete(person);
	}
		
	}

	

