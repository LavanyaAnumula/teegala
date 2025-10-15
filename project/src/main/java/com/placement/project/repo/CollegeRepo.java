package com.placement.project.repo;


import com.placement.project.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepo extends JpaRepository<College, Long> {
}