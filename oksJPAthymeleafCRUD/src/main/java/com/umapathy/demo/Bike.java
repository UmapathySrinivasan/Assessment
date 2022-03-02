package com.umapathy.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int version;
	private String name;
	
	
	
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bike(int version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Bike [version=" + version + ", name=" + name + "]";
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
