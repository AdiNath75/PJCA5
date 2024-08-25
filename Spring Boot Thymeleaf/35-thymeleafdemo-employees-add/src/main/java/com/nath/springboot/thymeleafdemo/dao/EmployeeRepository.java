package com.nath.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.nath.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepositoryImplementation<Employee, Integer> {

	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastName();
}
