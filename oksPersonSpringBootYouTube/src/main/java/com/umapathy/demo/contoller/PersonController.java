package com.umapathy.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.entity.Person;
import com.umapathy.demo.service.PersonService;

@RestController

public class PersonController {
	@Autowired
	private final PersonService personservice;
	
	public PersonController(PersonService personservice) {
		super();
		this.personservice = personservice;
	}

			@GetMapping("/Display")
			public List<Person> show() {
			return personservice.show();
			}
			@PostMapping("/Add")
			public void add(@RequestBody Person person) {
			personservice.add(person);
			}
			@PutMapping("/Update")
			public  void update(@RequestBody Person person) {
			personservice.update(person);
		     }
			@DeleteMapping("/Delete")
			public void delete(@RequestBody Person person) {
			personservice.delete(person);
			}
	
}
