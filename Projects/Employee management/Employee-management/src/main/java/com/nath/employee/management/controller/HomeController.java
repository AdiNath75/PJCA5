package com.nath.employee.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nath.employee.management.dao.EmployeeRepository;
import com.nath.employee.management.entity.Employee;


@Controller
public class HomeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	// create mapping for home page
	@GetMapping("/")
	public String showHome(Model theModel) {
		return "index";
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("employee", new Employee());
		
		return "signup_form";
	}
	
	@GetMapping("/login")
	public String showLoginForm(Model theModel) {
		return "login";
	}
	
	@PostMapping("/process_register")
	public String processRegister(Employee theEmployee) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(theEmployee.getPassword());
		theEmployee.setPassword(encodedPassword);
		
		employeeRepo.save(theEmployee);
		
		return "register_success";
	}
	
	@GetMapping("/employees")
	public String listEmployees(Model model) {
		List<Employee> listEmployees = employeeRepo.findAll();
		model.addAttribute("listEmployees", listEmployees);
		
		return "employees";
	}
	
	@PostMapping("/login")
	public String confirmLogin(Model theModel) {
		List<Employee> listEmployees = employeeRepo.findAll();
		theModel.addAttribute("listEmployees", listEmployees);
		return "employees";
	}
}
