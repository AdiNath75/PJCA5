package com.nath.springboot.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nath.springboot.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	// load employee data
	
	private List<Employee> theEmployee;
	
	@PostConstruct
	private void loadData() {
		
		// create employees
		Employee emp1 = new Employee(1, "MS", "Dhoni", "dhoni@nath.com");
		Employee emp2 = new Employee(2, "Suresh", "Raina", "suresh@nath.com");
		Employee emp3 = new Employee(3, "Ruturaj", "Gaikawad", "rutu@nath.com");
		Employee emp4 = new Employee(4, "Ambati", "Rayudu", "ambati@nath.com");
		
		
		// create the list
		theEmployee = new ArrayList<>();
		
		// add to the list
		theEmployee.add(emp1);
		theEmployee.add(emp2);
		theEmployee.add(emp3);
		theEmployee.add(emp4);
		
	}
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// add to the spring model
		theModel.addAttribute("employees", theEmployee);
		
		return "list-employees";
	}

}
