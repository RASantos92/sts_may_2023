package com.robert.mvcdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.robert.mvcdemo.models.Donation;
import com.robert.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class ApiController {

	private final DonationService donationServ;
	public ApiController(DonationService donationServ) {
		this.donationServ = donationServ;
	}
	
	@GetMapping("/donations")
	public List<Donation> findAllDonations(){
		return donationServ.getAll();
	}
	
	@PostMapping("/donations")
	public Donation createDonation(@RequestParam("name") String name, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity) {
		Donation newDonation = new Donation(name,donor,quantity);
		return donationServ.create(newDonation);
	}
	
	//-------------FIND ONE (/donations/{id})----------------
	@GetMapping("/donations/{id}")
	public Donation findOneDonation(@PathVariable("id") Long id) {
		return donationServ.getOne(id);
	}
	
	
	 //-------------Edit (/donations/{id})----------------
	@PutMapping("/donations/{id}")
	public Donation editOneDonation(@PathVariable("id") Long id,@RequestParam("name") String name, @RequestParam("donor") String donor, @RequestParam("quantity") Integer quantity ) {
		
		Donation donationToBeUpdated = new Donation(name, donor, quantity);
		donationToBeUpdated.setId(id);
		
		return donationServ.update(donationToBeUpdated);
	}
	
	
	
	
	//-------------Delete (/donations/{id})----------------
	@DeleteMapping("/donations/{id}")
	public String deleteDonation(@PathVariable("id") Long id) {
		donationServ.delete(id);
		return id + " has been deleted";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
