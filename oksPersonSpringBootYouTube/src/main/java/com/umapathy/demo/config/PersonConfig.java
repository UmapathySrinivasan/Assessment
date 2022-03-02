package com.umapathy.demo.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.umapathy.demo.entity.Person;

@Configuration
public interface PersonConfig  {
	public void add(Person person);
	public List<Person> show();
	public void update(Person person);
	public void delete();
	
}