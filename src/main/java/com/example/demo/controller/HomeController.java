package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String getHomepage()
	{
		return "Home page landing";
	}
	
	@GetMapping("/about")
	public String getAboutPage()
	{
		return "About page landing";
	}
	
}
