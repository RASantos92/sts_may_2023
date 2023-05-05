package com.robert.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	
	@RequestMapping("/api/option/1")
	public String option1() {
		return "Option 1 request mapping";
	}
	
	@RequestMapping(value="/api/option/2", method = RequestMethod.GET)
	public String option2() {
		return "Option 2 request mapping";
	}
	
	@GetMapping("/api/option/3")
	public String option3() {
		return "Option 4 request Mapping";
	}
	
	
	


}
