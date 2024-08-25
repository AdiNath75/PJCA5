package com.nath.employee.management.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.nath.employee.management.dao.EmployeeRepository;
import com.nath.employee.management.entity.CustomemployeeDetails;
import com.nath.employee.management.entity.Employee;

public class CustomEmployeeDetailsService implements UserDetailsService {

	private EmployeeRepository employeeRepository;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Employee theEmployee = employeeRepository.findByEmail(username);
		if (theEmployee == null) {
			throw new UsernameNotFoundException("Employee not found");
		}
		return new CustomemployeeDetails(theEmployee);
	}
}
