package com.robert.mvcdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.mvcdemo.services.DonationService;

@Controller
@RequestMapping("/donations")
public class DonationController {
	
	public final DonationService donationServ;
	public DonationController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("")
	public String allDonations(Model model) {
		model.addAttribute("allDonations", donationServ.getAll());
		return "donation/showAll.jsp";
	}
	
	@GetMapping("/{id}")
	public String oneDonation(@PathVariable("id") Long id,Model model) {
		model.addAttribute("donation", donationServ.getOne(id));
		return "donation/displayOne.jsp";
	}

}
