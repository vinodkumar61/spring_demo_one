package com.geeks.springdemo;

public class BaseballCoach implements Coach {
	
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend daily 30 mintues on batting practice";
	}

	@Override
	public String getDailyFortune() {
	   // use myfortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
