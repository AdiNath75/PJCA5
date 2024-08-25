package com.nath.springboot.cruddemo.service;

import java.util.List;

import com.nath.springboot.cruddemo.entiry.Employee;

public interface EmployeeService {
	
public List<Employee> findAll();
	
	public Employee findIdBy(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
