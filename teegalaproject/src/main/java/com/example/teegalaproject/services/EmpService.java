package com.example.teegalaproject.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.teegalaproject.model.Employee;
import com.example.teegalaproject.repo.EmpRepo;

public class EmpService {
	
	@Autowired
	EmpRepo er;
	
	//insert
	
	public Employee addEmp(Employee emp)
	{
		return er.save(emp);
	
	}
	
	//delete
	
	
}