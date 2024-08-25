package com.nath.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	// inject properties for: coach.name and team.name
	@Value("${coach.name}")
	private String coachName;
	@Value("${team.name}")
	private String teamName;
	
	// expose new endpoint for team info
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach name: " + coachName + ", Team name: "+teamName;
	}
	
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
