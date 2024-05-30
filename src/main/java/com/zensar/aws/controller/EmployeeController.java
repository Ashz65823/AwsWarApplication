package com.zensar.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.aws.entity.Employee;
import com.zensar.aws.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return service.saveEmployee(employee);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employee)
	{
		return service.saveEmployees(employee);
	}

	@GetMapping("/allEmployees")
	public List<Employee> findAllEmployees()
	{
		System.out.println("Printing all employess");
		return service.getAllEmployees();
	}
	
	@GetMapping("/Employee/{id}")
	public Employee findEmployeeByID(@PathVariable int id)
	{
		System.out.println("_____Printing all employess");
		return service.getEmployeeById(id);
	}
}
