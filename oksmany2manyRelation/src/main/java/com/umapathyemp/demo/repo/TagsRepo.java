package com.umapathyemp.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.umapathyemp.demo.entity.Tags;
@Repository
public interface TagsRepo extends JpaRepository<Tags, Long> {

}
