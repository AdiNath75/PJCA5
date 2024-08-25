package com.nath.employee.management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nath.employee.management.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByEmail(String email);
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastName();
	

}
