package com.nath.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nath.springboot.cruddemo.entiry.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
