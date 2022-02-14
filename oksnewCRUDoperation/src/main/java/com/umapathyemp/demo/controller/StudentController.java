package com.umapathyemp.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.umapathyemp.demo.entity.Student;
import com.umapathyemp.demo.repo.StudentRepo;
@RestController
public class StudentController {
	@Autowired

	StudentRepo studentrepo;
	
	@GetMapping("/Display")
	public List<Student> getAllPerson() {
	return studentrepo .findAll();
	}
		@PostMapping("/Add")
		public Student saveStudent(@RequestBody Student student) {
		return studentrepo.save(student);
		}
			@PutMapping("/Update")
			public Student updateStudent(@RequestBody Student student) {
			return studentrepo.save(student);
		}
			@DeleteMapping("/Delete")
			public String deleteStudent(@RequestBody Student student) {
		studentrepo.delete(student);
		return "deleted Successfully";
	}
}
