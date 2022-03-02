package com.umapathy.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BikeServiceImpl implements BikeService {
	
	@Autowired
	private BikeRepo bikerepo;

	@Override
	public void add(Bike bike) {
		// TODO Auto-generated method stub
		bikerepo.save(bike);
	}

	@Override
	public List<Bike> show() {
		// TODO Auto-generated method stub
		return bikerepo.findAll();
	}

	@Override
	public void update(Bike bike) {
		// TODO Auto-generated method stub
		bikerepo.save(bike);
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		bikerepo.deleteAll();
	}

	
}
