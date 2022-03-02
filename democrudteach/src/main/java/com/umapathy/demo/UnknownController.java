package com.umapathy.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UnknownController {
	@Autowired
	UnknownConfig unknownconfig;
	
	@PostMapping("/Adduk")
	public void add(@RequestBody Unknown unknown) {
	unknownconfig.add(unknown);
	}
	
	@GetMapping("/Displayuk")
	public List<Unknown> show(){
		return unknownconfig.show();
	}
	
	@PutMapping("/Updateuk")
	public void update(@RequestBody Unknown unknown) {
		unknownconfig.add(unknown);
	}
	@DeleteMapping("/Deleteuk/{id}")
	public void  delete(@PathVariable int  id) {
		unknownconfig.delete(id);
	}
}
