package com.umapathy.demo;

import java.util.List;


public interface BikeService {
	
	
  public void add(Bike bike);
 public List<Bike> show();
 public void update(Bike bike);
 public void delete();
}
