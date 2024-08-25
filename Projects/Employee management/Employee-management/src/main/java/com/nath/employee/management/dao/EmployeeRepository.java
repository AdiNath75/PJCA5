package com.nath.employee.management.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nath.employee.management.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	@Query("SELECT u FROM Employee u WHERE u.email = ?1")
	public Employee findByEmail(String email);
	
	// add a method to sort by last name
		public List<Employee> findAllByOrderByLastName();

}
