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
import org.springframework.web.bind.annotation.RequestParam;

import com.nath.employee.management.dao.EmployeeRepository;
import com.nath.employee.management.entity.Employee;
import com.nath.employee.management.service.EmployeeService;


@Controller
public class HomeController {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	private EmployeeService employeeService;
	
	public HomeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "index";
	}
	
	
	@GetMapping("/employees")
	public String confirmLogin(Model theModel) {
		List<Employee> listEmployees = employeeRepo.findAll();
		theModel.addAttribute("listEmployees", listEmployees);
		return "employees";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
		
		// get the employee from the service
		Employee theEmployee = employeeService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("employee", theEmployee);
		
		// send over to our form
		return "/update";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
		
		// save the employee
		employeeService.save(theEmployee);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/employees";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("employeeId") int theId) {
		
		// delete the employee
		employeeService.deleteById(theId);
		
		// redirect to /employees-list
		return "redirect:/employees";
	}
	
}
