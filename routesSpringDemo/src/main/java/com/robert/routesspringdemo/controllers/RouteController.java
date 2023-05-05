package com.robert.routesspringdemo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
public class RouteController {

	//https://www.google.com/search?q=huskies
	
	@RequestMapping("/")
	public String searchKeyword(@RequestParam("keyword") String keywordInMethod) {
		return "You are searching for " + keywordInMethod;
	}
	
	@RequestMapping("/pet")
	public String getPet(@RequestParam("name") String petName, @RequestParam("age") Integer age) {
		return "Your pet " + petName + " is " + age + " years old";
	}
	
	@RequestMapping("/optional/pet")
	public String getPetOptional(@RequestParam(value="name", required=false) String petName, @RequestParam(value="age", required=false) Integer age) {
		return "Your pet " + petName + " is " + age + " years old";
	}
	
	//https://login.codingdojo.com/m/315/9532/64273
	
	@RequestMapping("/path/m/{name}/{color}")
	public String petWithColor(@PathVariable("name") String name, @PathVariable("color") String color) {
		return name + " is " + color;
	}
	

}
