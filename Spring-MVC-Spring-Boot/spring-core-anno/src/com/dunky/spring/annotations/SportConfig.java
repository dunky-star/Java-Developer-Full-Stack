package com.dunky.spring.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan("com.dunky.spring.annotations")
public class SportConfig {
	
	// define bean for our sad fortune service
		@Bean
		public FortuneService sadFortuneService() {
			return new SadFortuneService();
		}
		
		// define bean for our swim coach AND inject dependency
		@Bean
		public Coach swimCoach() {
			SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
			
			return mySwimCoach;
		}
	
}
