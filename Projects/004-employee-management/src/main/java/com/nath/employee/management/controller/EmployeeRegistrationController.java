package com.nath.employee.management.controller;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.employee.management.entity.Employee;
import com.nath.employee.management.service.EmployeeService;

@Controller
@RequestMapping("/registration")
public class EmployeeRegistrationController {

	private EmployeeService employeeService;

	public EmployeeRegistrationController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@ModelAttribute("employee")
	public Employee theEmployee() {
		return new Employee();
	}

	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}

	@PostMapping
	public String registerEmployeeAccount(@Valid @ModelAttribute("employee") Employee theEmployee) {

			employeeService.save(theEmployee);
			return "register_success";
	}
}
