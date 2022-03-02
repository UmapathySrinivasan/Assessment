package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.entity.Umapathy;
@Repository
public interface UmapathyRepo extends JpaRepository<Umapathy, Integer> {

}
