package com.adi.springdemo;

public class BaseBallCoach implements Coach {
	
	// Define private field for a Dependency
	private FortuneService fortuneService;
	
	//define a constructor for DI
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	public String getDailyWorkOut() {
		return "Spend 30 min on Batting Practice";
	}

	@Override
	public String getDailyFortune() {
		//use fortuneservice to get fortune
		return fortuneService.getFortune();
	}

}
