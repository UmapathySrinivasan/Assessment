package com.umapathyemp.demo.serviceimplemention;

import org.springframework.beans.factory.annotation.Autowired;

import com.umapathyemp.demo.entity.Posts;
import com.umapathyemp.demo.repo.PostRepo;
import com.umapathyemp.demo.service.PostService;

public class PostServiceImpl implements PostService{
@Autowired(required = true)
PostRepo postrepo;
	
	public void add(Posts post) {
		// TODO Auto-generated method stub
		postrepo.save(post);
	}

}
