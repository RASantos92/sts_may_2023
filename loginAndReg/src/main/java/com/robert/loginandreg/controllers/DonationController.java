package com.robert.loginandreg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.robert.loginandreg.models.Donation;
import com.robert.loginandreg.services.DonationService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/donations")
public class DonationController {

	private final DonationService donationServ;
	public DonationController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/create")
	public String createDonation(@ModelAttribute("donation") Donation donation) {
		return "donation/create.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreateDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			return "donation/create.jsp";
		}
		donationServ.create(donation);
		return "redirect:/";
				
	}
	
	@GetMapping("/edit/{id}")
	public String editDonation(@PathVariable("id") Long id, Model model, HttpSession session) {
		Donation donation = donationServ.getOne(id);
		if(!donation.getDonor().getId().equals(session.getAttribute("user_id")) ) {
			return "redirect:/";
		}
		model.addAttribute("donation", donationServ.getOne(id));
		return "donation/edit.jsp";
	}
	
	@PutMapping("/process/edit/{id}")
	public String processEditDonation(@Valid @ModelAttribute("donation") Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			 return "donation/edit.jsp";
		}
		donationServ.update(donation);
		return "redirect:/";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/{id}")
	public String showOneDonation(@PathVariable("id") Long id, Model model) {
		model.addAttribute("donation", donationServ.getOne(id));
		return "donation/displayOne.jsp";
	}
}
