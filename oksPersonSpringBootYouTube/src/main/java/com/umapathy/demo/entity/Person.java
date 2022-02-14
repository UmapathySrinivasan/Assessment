package com.umapathy.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table
public class Person {
	
	@Id
	@SequenceGenerator(
	name="person_sequence",sequenceName="person_sequence",allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "person_sequence")
	protected  int pId;
	protected String pName;
	protected String eMail;
	public Person(int pId, String pName, String eMail) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.eMail = eMail;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", eMail=" + eMail + "]";
	}


}
