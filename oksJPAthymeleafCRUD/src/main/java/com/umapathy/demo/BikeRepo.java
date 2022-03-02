package com.umapathy.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BikeRepo extends JpaRepository<Bike, Integer> {

	
}
