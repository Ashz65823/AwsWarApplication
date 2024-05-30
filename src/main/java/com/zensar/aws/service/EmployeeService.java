package com.zensar.aws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.aws.entity.Employee;
import com.zensar.aws.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employee) {
		return repository.saveAll(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}

	
	
	

}
