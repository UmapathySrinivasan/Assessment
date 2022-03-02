package com.umapathy.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Human {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@OneToMany(cascade = CascadeType.ALL)
	 private int id;
	 private String name;

}
