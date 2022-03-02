package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.entity.Umapathy;

public interface UmapathyService {
	
	public void add(Umapathy umapathy);
	public List<Umapathy> show();
	public void delete();
	
	

}
