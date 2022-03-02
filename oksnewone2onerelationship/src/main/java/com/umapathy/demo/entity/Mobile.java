package com.umapathy.demo.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int model;
	private String mName;
	
	
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", mName=" + mName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(mName, model);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		return Objects.equals(mName, other.mName) && model == other.model;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	
	
	

}
