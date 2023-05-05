package com.robert.routesspringdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
	
	@GetMapping("/first/jsp")
	public String firstJsp(Model model) {
		model.addAttribute("someData" , "this is coming from the controller");
		return "index.jsp";
	}
	


}
