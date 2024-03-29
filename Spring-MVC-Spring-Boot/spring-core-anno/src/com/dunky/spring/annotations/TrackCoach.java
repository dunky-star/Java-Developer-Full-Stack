package com.dunky.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	// define a private field for the dependency
	private FortuneService fortuneService;

	public TrackCoach() {
		
	}
	// define a constructor for dependency injection
	@Autowired
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return "You have been lucky today: Just do it...";
	}

}