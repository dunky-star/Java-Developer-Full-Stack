package com.dunky.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// need a controller method to show the initial HTML form
	@RequestMapping("/")
	public String showHomePage() {
		return "main-menu";
	}
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}


}
