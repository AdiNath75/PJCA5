package com.adi.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// Add new fields for email and team
	private String emailAddress;
	private String team;
	
	// Create no-args constructor
	public CricketCoach() {
		System.out.println("CricketCoach: From no arg Constructor");
	}
	
	
	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: From Setter Method - setEmailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: From Setter Method - setTeam");
		this.team = team;
	}


	// Our Setter Method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: From Setter Method - fortune Service");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkOut() {
		
		return "Practice Batting for 30 Minutes";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
