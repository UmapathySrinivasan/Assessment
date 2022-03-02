package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.entity.Umapathy;
import com.umapathy.demo.serviceimpl.UmapathyServiceImpl;

@RestController

public class Umapathycontroller {
	
	@Autowired
	UmapathyServiceImpl usi;
	
	@PostMapping("/savedata")
	public void store(@RequestBody Umapathy umapathy) {
		usi.add(umapathy);
	}
	@GetMapping("/fetchdata")
	public List<Umapathy> display(){
		return usi.show();
		}
	@DeleteMapping("/removedata")
	public void delete() {
		usi.delete();
	}
	

}
