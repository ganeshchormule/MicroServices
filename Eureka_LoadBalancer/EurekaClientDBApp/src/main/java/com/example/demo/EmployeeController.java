package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {

	@Autowired
	private EmployeeRepository repository;
	
	@PostConstruct
	public void insertEmployees()
	{
		for(int i=0; i < 7; i++)
		{
			Employee emp = new Employee();
			emp.setId(i);
			emp.setName("Ganesh " + i);
			
			
			repository.save(emp);
		}
	}	
	
	@GetMapping(value="/list")
	public List<Employee> listEmployees()
	{
		return repository.findAll();	
	}
}
