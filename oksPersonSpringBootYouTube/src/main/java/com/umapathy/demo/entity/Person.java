package com.umapathy.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Person {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private  long pId;
	private String pName;
	private String eMail;
	public Person(long pId, String pName, String eMail) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.eMail = eMail;
	}
	public Person() {
		super();
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
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
