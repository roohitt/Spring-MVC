package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//below is parent request mapping to remove ambiguity now we'll use hello/showForm
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//controller method to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process the form method
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//new a controller method to read form data and
	// add data to the model
	
	@RequestMapping("/processFormVersionThree")
	public String letShoutDude(@RequestParam("studentName") String theNameString,Model model) {
		
		
		//convert the data to all caps
		theNameString = theNameString.toUpperCase();
		//create a message
		String resultString = "Yo!"+theNameString;
		//add message to the model
		model.addAttribute("message",resultString);
		
		return "helloWorld";
		}

}
