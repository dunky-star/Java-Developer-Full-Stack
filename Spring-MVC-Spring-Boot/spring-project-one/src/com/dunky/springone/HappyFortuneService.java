package com.dunky.springone;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortue() {
		
		return "Today is your lucky day!";
	}

}
