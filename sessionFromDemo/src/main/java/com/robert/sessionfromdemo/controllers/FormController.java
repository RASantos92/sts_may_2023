package com.robert.sessionfromdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class FormController {
	// https://www.google.com/search?q=huskys
	@GetMapping("/search")
	public String searchForm(@RequestParam(value="keyword", required=false) String keyword, Model model) {
		System.out.println(keyword == "");
		if(keyword != "") {
			model.addAttribute("displayInfoFromForm", keyword);
			return "getForms/displaySearchForm.jsp";
		}
		
		return "getForms/searchForm.jsp";
	}
	
	@GetMapping("/review/form")
	public String reviewForm( ) {
		return "postForms/reviewForm.jsp";
	}
	
	@PostMapping("/process/create")
	public String processCreate(HttpSession session,@RequestParam("movie") String movie,@RequestParam("comment") String comment, @RequestParam("rating") Integer rating) {
		session.setAttribute("movie", movie);
		session.setAttribute("comment", comment);
		session.setAttribute("rating", rating);
		return "redirect:/success";
	}
	
	@GetMapping("/success")
	public String displayPostForm() {
		return "postForms/displayReviewForm.jsp";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
