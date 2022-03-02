package com.umapathy.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.entity.Mobile;
import com.umapathy.demo.repo.MobileRepo;
import com.umapathy.demo.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService{
	
	@Autowired
	private MobileRepo mobilerepo;

	@Override
	public void add(Mobile mobile) {
		// TODO Auto-generated method stub
		mobilerepo.save(mobile);
	}

	@Override
	public List<Mobile> show() {
		// TODO Auto-generated method stub
		return mobilerepo.findAll();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		mobilerepo.deleteAll();
	}

}
