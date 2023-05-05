package com.robert.jspjstldemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String jspDemo() {
		return "index.jsp";
	}
	
	@GetMapping("/jstl")
	public String jstlDemo(Model model) {
		String name = "Kyle G";
		Integer age = 28;
		Boolean isHungry = true;
		model.addAttribute("nameFromController", name);
		model.addAttribute("ageFromController", age);
		model.addAttribute("isHungryFromController", isHungry);
		model.addAttribute("test", "<script>alert('something')</script>");
		ArrayList<String> users = new ArrayList<String>();
		users.add("Kayle G");
		users.add("Tina H");
		users.add("Jordan N");
		users.add("Mike N");
		for(String userName : users) {
			System.out.println(userName);
		}
		
		model.addAttribute("users", users);
		
		return "jstl.jsp";
	}

}
