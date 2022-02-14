/*package com.umapathy.demo.config;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.umapathy.demo.entity.Person;
import com.umapathy.demo.repo.PersonRepo;

@Configuration
public class PersonConfig extends Person {
	@Bean
	CommandLineRunner commandLineRunner(PersonRepo personrepo) {
		return args -> {
		Person umapathy=new Person(
					pId=1,
					pName="umapathy",
					eMail="uma@gmail");
			
		Person harish=new Person(
				pId=2,
				pName="harish",
				eMail="harish@gmail");
		
		Person vijay=new Person(
				pId=3,
				pName="vijay",
				eMail="vijay@gmail");
		
		
			
		
		
		personrepo.saveAll(List.of(umapathy,harish,vijay));
		};
		
	
		
	}
}*/
