package com.nath.springboot.thymeleafdemo.service;

import java.util.List;
import com.nath.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {
	
public List<Employee> findAll();
	
	public Employee findIdBy(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
