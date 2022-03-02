package com.umapathy.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umapathy.demo.entity.Umapathy;
import com.umapathy.demo.repo.UmapathyRepo;
import com.umapathy.demo.service.UmapathyService;
@Service
public class UmapathyServiceImpl implements UmapathyService {
 @Autowired
   UmapathyRepo umapathyrepo;
 
	@Override
	public void add(Umapathy umapathy) {
		// TODO Auto-generated method stub
		umapathyrepo.save(umapathy);
	}

	@Override
	public List<Umapathy> show() {
		// TODO Auto-generated method stub
		return umapathyrepo.findAll();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		umapathyrepo.deleteAll();
	}

}
