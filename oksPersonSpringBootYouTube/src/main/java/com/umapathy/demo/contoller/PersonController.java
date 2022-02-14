package com.umapathy.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.entity.Person;
import com.umapathy.demo.service.PersonService;

@RestController
@RequestMapping
public class PersonController {
	
	private final PersonService personservice;
	@Autowired
	public PersonController(PersonService personservice) {
		super();
		this.personservice = personservice;
	}

			@GetMapping("/Display")
			public List<Person> getAllPersons() {
				return personservice.getPersons();
			}
			@PostMapping("/Add")
			public Person savePerson(@RequestBody Person person) {
			return personservice.save(person);
			}
			
			@PutMapping("/Update")
			public  Person updatePerson(@RequestBody Person person) {
			return personservice.save(person);
		}
	
	/*@PostMapping("/Add")
		public Person savePerson(@RequestBody Person person) {
		return personservice.save(person);
		}
			@PutMapping("/Update")
			public Person updatePerson(@RequestBody Person person) {
			return personservice.save(person);
		}
			@DeleteMapping("/Delete")
			public String deletePerson(@RequestBody Person person) {
				personservice.delete(person);
				return "deleted Successfully";
	}*/
}
