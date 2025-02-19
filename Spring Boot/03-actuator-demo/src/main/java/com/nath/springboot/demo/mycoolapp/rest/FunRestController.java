package com.nath.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Welcome to SpringBoot World! Time on server is " + LocalDateTime.now();
	}  
	
	// expose a new end point for "work out"
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5K!";
	}
	
	// expose a new end 0point for fortune
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
	
}
