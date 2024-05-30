package com.zensar.aws.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.aws.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
