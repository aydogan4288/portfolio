package com.ferhat.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

	
	
	@GetMapping("/")
	public String index() {
		System.out.println("loading index");
		return "index.jsp";
	}
	
	@GetMapping("/blog")
	public String blog() {
		System.out.println("loading blog page");
		return "blog.jsp";
	}
	
	@GetMapping("/ideas")
	public String ideas() {
		System.out.println("loading ideas");
		return "ideas.jsp";
	}
	
	@GetMapping("/newsApi")
	public String newsApi() {
		System.out.println("loading news api");
		return "news_api.jsp";
	}
	
	@GetMapping("/petShelter")
	public String petShelter() {
		System.out.println("loading pet shelter");
		return "pet_shelter.jsp";
	}
	
	@GetMapping("/wishList")
	public String wishList() {
		System.out.println("loading wish list");
		return "wish_list.jsp";
	}

}
