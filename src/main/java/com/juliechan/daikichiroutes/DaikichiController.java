package com.juliechan.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {

	// WELCOME
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	// TODAY YOU WILL FIND LUCK...
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	// TOMORROW, AN OPPORTUNITY
	@RequestMapping("/tomorrow")
	public String tom() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
