package com.umapathyemp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService {
	@Autowired
	
	private EmployeeRepository repo;
	
	public List<Employee>listall(){
		return repo.findall();
	}
		
		public void save (Employee emp){
			 repo.save(emp);
	}
		public EmployeeService get(long id) {
			return repo.findById(id).get();
		}
		public void delete(long id) {
			repo.deleteById(id);
		}
	
	

}
