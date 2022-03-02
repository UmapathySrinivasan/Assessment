package com.umapathy.demo;

import java.util.List;

public interface UnknownService {
	
	public void add(Unknown unknown);
	
	public List<Unknown> show();
	
	public void update(Unknown unknown);
	
	public void delete(int id);

}
