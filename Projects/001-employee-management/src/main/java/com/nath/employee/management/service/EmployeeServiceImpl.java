package com.nath.employee.management.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.nath.employee.management.dao.EmployeeRepository;
import com.nath.employee.management.entity.Employee;
import com.nath.employee.management.entity.Role;
import com.nath.employee.management.web.dto.EmployeeRegistrationDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public BCryptPasswordEncoder passwordEncoder;

	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		employeeRepository = theEmployeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAllByOrderByLastName();
	}

	@Override
	public Employee findById(int theId) {
		Optional<Employee> result = employeeRepository.findById(theId);
		Employee theEmployee = null;

		if (result.isPresent()) {
			theEmployee = result.get();
		} else {
			throw new RuntimeException("Did Not find employee id - " + theId);
		}
		return theEmployee;
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);

	}

	@Override
	public Employee save(EmployeeRegistrationDto registrationDto) {
		Employee theEmployee = new Employee(registrationDto.getFirstName(),registrationDto.getLastName(),
				registrationDto.getEmail(),passwordEncoder.encode( registrationDto.getPassword()),Arrays.asList(new Role("ROLE_USER")));
		
		return employeeRepository.save(theEmployee);

	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Employee theEmployee = employeeRepository.findByEmail(username);
		if(theEmployee == null) {
			throw new UsernameNotFoundException("Invalid usenaem or password.");
		}
		return new User(theEmployee.getEmail(),theEmployee.getPassword(), mapRolesToAuthorities(theEmployee.getRoles()));
	}
	
	private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
		return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	}

	@Override
	public Employee save(Employee theEmployee) {
		employeeRepository.save(theEmployee);		return null;
	}


}
