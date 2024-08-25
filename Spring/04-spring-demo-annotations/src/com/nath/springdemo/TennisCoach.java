package com.nath.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class TennisCoach implements Coach {
	
	// field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println(">> Tennis Coach: inside default constructor");
	}
	
	// define my init method
	@PostConstruct
	public void doMyStartupSTuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupSTuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupSTuff()");
	}
	
	// define a setter method setter injection
	/*@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> Tennis Coach: inside setFortuneService");
		fortuneService = theFortuneService;
	}
	*/
	
	// method injection
	/*
	 @Autowired
	public void doSomeCrazzyStuff(FortuneService theFortuneService) {
		System.out.println(">> Tennis Coach: inside doSomeCrazzyStuff method");
		fortuneService = theFortuneService;
	}
	*/
	
	// constructor injection
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
