package com.dunky.spring.annotations;


public class MyApp {

	public static void main(String[] args) {

		// create the object
		// Coach theCoach = new TrackCoach();
		Coach theCoach = new BaseballCoach();
		
		// use the object
		System.out.println(theCoach.getDailyWorkout());		
	}

}
