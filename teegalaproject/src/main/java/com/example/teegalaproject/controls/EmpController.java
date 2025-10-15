package com.example.teegalaproject.controls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.teegalaproject.model.Employee;
import com.example.teegalaproject.services.EmpService;

public class EmpController {
	@Autowired
	EmpService es;
	
	@PostMapping("/addemployee")
	public Employee addEmp(Employee emp)
	{
		return emp;
		
	}
}
