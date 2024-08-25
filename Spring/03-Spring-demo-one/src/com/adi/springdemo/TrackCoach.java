package com.adi.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
	}
	
	public TrackCoach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run 4km";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just DO It: "+ fortuneService.getFortune();
	}
	
	// add init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach: inside method doMyStartupStuff");
	}
	
	// add destroy method
	public void doMyCleanupStuff() {
		System.out.println("Track Coach: inside method doMyCleanupStuff");
	}
}
