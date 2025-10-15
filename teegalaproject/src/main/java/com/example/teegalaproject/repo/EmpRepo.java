package com.example.teegalaproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teegalaproject.model.Employee;

//MarkerInterface
public interface EmpRepo extends JpaRepository<Employee,Integer>{

	
	
}