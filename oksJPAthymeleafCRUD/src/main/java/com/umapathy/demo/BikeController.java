package com.umapathy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bike/rest")
public class BikeController {
	@Autowired
	private BikeServiceImpl bikeServiceImpl;
	
	@PostMapping("/datasave")
	public void store(@RequestBody Bike bike) {
		bikeServiceImpl.add(bike);
	}
	@GetMapping("/datafetch")
	public String display(){
		bikeServiceImpl.show();
		return "DataFetchSucessfully";
		}
	@DeleteMapping("/datadelete")
	public  String delete() {
		bikeServiceImpl.delete();
		return "Deleted Sucessfully";
		}
	
/*
	    @GetMapping("/{empid}")
	    public Bike listOneEmployee(@PathVariable Long empid){
	        return bikeServiceImpl.findById(empid).get();
	    }
	    @PostMapping("/")
	    public Employee saveOneEmployee(@RequestBody Employee employee){
	        return employeeRepository.save(employee);
	    }
	    @PutMapping("/")
	    public Employee updateOneEmployee(@RequestBody Employee employee){
	        return employeeRepository.save(employee);
	    }
	    @PutMapping("/{empid}")
	    public ResponseEntity<Employee> updateOneEmployee(@PathVariable(value = "empid") Long empid, @RequestBody Employee employee){
	        Employee emp1=employeeRepository.findById(empid).get();
	        emp1.setEmpid(employee.getEmpid());
	        emp1.setEmpname(employee.getEmpname());
	        emp1.setEmpphone(employee.getEmpphone());
	        Employee emp2=employeeRepository.save(emp1);
	        return ResponseEntity.ok(emp2);
	    }
	    @DeleteMapping("/")
	    public String deleteOneEmployee(@RequestBody Employee employee){
	        employeeRepository.delete(employee);
	        return "Deleted : "+employee.toString();
	    }
	    @DeleteMapping("/{empid}")
	    public String deleteOneByIdEmployee(@PathVariable Long empid){
	        employeeRepository.deleteById(empid);
	        return "Deleted : "+empid;
	    }
	}
	*/
	

}
