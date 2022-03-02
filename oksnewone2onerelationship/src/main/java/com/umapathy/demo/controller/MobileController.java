package com.umapathy.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.umapathy.demo.entity.Mobile;
import com.umapathy.demo.serviceimpl.MobileServiceImpl;

@RestController

public class MobileController {
	
	@Autowired
	private MobileServiceImpl msi;
	
	@PostMapping("/save")
	public void store(@RequestBody Mobile mobile) {
		msi.add(mobile);
	}
	@GetMapping("/fetch")
	public List<Mobile> display(){
		return msi.show();
		}
	@DeleteMapping("/remove")
	public void delete() {
		msi.delete();
	}

}
