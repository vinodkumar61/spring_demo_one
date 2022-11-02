package com.geeks.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run a hard 5k";
	}

	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: "+ fortuneService.getFortune();
	}
	
	// add an init method
     public void doMyStartupStuff() {
    	 System.out.println("TrackCoach: inside method doMyStartupStuff()");
     }
	// add an destory method
    public void doMyCleanupStuff() {
    	System.out.println("TrackCoach: inside method doMyCleanupStuff()"); 
     }
}
