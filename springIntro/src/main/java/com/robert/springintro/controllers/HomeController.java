package com.robert.springintro.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@RequestMapping("/testing")
	public String test() {
		return "Testing...";
	}
	
	@RequestMapping("/number")
	public int intTest() {
		return 52;
	}
	
}
