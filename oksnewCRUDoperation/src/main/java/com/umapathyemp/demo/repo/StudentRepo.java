package com.umapathyemp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.umapathyemp.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
}