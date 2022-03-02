package com.umapathy.demo.service;

import java.util.List;

import com.umapathy.demo.entity.Mobile;

public interface MobileService {

	
	public void add(Mobile mobile);
	public List<Mobile> show();
	public void delete();
}
