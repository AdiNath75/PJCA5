package com.nath.employee.management.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.nath.employee.management.entity.Employee;
import com.nath.employee.management.web.dto.EmployeeRegistrationDto;

public interface EmployeeService extends UserDetailsService{
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public Employee save(EmployeeRegistrationDto registrationDto);
	
	public void deleteById(int theId);
	

}
