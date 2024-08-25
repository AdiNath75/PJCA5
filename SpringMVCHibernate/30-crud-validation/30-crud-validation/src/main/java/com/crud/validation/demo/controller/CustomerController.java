package com.crud.validation.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crud.validation.demo.entity.Customer;
import com.crud.validation.demo.repository.CustomerRepository;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerRepository customerRepository;

	@Autowired
	    public CustomerController(CustomerRepository customerRepository) {
	        this.customerRepository = customerRepository;
	    }

	@GetMapping("signup")
	public String showSignUpForm(Customer theCustomer) {
		return "add-customer";
	}

	@GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("customers", customerRepository.findAll());
		return "index";
	}

	@PostMapping("add")
	public String addStudent(@Valid Customer theCustomer, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-student";
		}

		customerRepository.save(theCustomer);
		return "redirect:list";
	}

	@GetMapping("edit/{id}")
	public Optional<Customer> showUpdateForm(@PathVariable("id") long theId, Model theModel) {
		Optional<Customer> theCustomer = customerRepository.findById(theId);
		return theCustomer;
		
	}
    

	@PostMapping("update/{id}")
	public String updateCustomer(@PathVariable("id") long id, @Valid Customer theCustomer, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			theCustomer.setId(id);
			return "update-customer";
		}

		customerRepository.save(theCustomer);
		model.addAttribute("customers", customerRepository.findAll());
		return "index";
	}
	

}
