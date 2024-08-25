package com.nath.employee.management.controller;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.employee.management.service.EmployeeService;
import com.nath.employee.management.web.dto.EmployeeRegistrationDto;

@Controller
@RequestMapping("/registration")
public class EmployeeRegistrationController {

	private EmployeeService employeeService;

	public EmployeeRegistrationController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@ModelAttribute("employee")
	public EmployeeRegistrationDto employeeRegistrationDto() {
		return new EmployeeRegistrationDto();
	}

	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}

	@PostMapping
	public String registerEmployeeAccount(@ModelAttribute("employee") EmployeeRegistrationDto registrationDto) {

			employeeService.save(registrationDto);
			return "register_success";
	
	}

}
