package com.robert.relationshipdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robert.relationshipdemo.services.DonationService;
import com.robert.relationshipdemo.services.UserService;

@Controller
public class HomeController {
	
	private final UserService userServ;
	private final DonationService donationServ;

	public HomeController(UserService userServ,DonationService donationServ) {
		this.userServ = userServ;
		this.donationServ = donationServ;
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("allUsers", userServ.getAll());
		return "main/dashboard.jsp";
	}

}
