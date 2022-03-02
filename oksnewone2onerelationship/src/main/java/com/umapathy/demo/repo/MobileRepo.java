package com.umapathy.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathy.demo.entity.Mobile;

@Repository
public interface MobileRepo extends JpaRepository<Mobile, Integer>{

}
