package com.nath.employee.management.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nath.employee.management.dao.EmployeeRepository;
import com.nath.employee.management.entity.Employee;


@Controller

public class HomeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}
	
	@GetMapping("/employees")
	public String confirmLogin(Model theModel) {
		List<Employee> listEmployees = employeeRepo.findAll();
		theModel.addAttribute("listEmployees", listEmployees);
		return "employees";
	}
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/view")
	public String showDetails(Model theModel) {
		List<Employee> listEmployees = employeeRepo.findAll();
		theModel.addAttribute("listEmployees", listEmployees);
		return "view";
	}
	
	/* @PostMapping("/process_register")
	public String processRegister(Employee theEmployee) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(theEmployee.getPassword());
		theEmployee.setPassword(encodedPassword);
		
		employeeRepo.save(theEmployee);
		
		return "register_success";
	}
	*/
	
}
