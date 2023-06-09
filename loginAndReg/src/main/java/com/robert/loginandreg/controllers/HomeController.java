package com.robert.loginandreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.robert.loginandreg.services.DonationService;
import com.robert.loginandreg.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	private final UserService userServ;
	private final DonationService donationServ;
	public HomeController(UserService userServ,DonationService donationServ) {
		this.userServ = userServ;
		this.donationServ = donationServ;
	}
	
	@GetMapping("/")
	public String home(HttpSession session,Model model) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/register";
		}
		model.addAttribute("allDonations", donationServ.getAll());
		model.addAttribute("loggedInUser",userServ.getUser((Long)session.getAttribute("user_id")));
		return "main/dashboard.jsp";
	}

}
