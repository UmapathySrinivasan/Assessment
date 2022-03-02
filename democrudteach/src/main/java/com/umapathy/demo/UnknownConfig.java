package com.umapathy.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UnknownConfig implements UnknownService {
	
	@Autowired
	UnknownRepo unknownrepo;

	@Override
	public void add(Unknown unknown) {
		// TODO Auto-generated method stub
		unknownrepo.save(unknown);
	}

	@Override
	public List<Unknown> show() {
		// TODO Auto-generated method stub
		return unknownrepo.findAll();
	}

	@Override
	public void update(Unknown unknown) {
		// TODO Auto-generated method stub
		unknownrepo.save(unknown);
		
	}

	@Override
	public void delete(int id) {
		
		// TODO Auto-generated method stub
		unknownrepo.deleteById(id);
		
	}
	
	
	

}
