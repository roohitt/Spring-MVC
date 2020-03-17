package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//controller method to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//process the form method
	@RequestMapping("processForm")
	public String processForm() {
		return "helloWorld";
	}
	
	//new a controller method to read form data and
	// add data to the model
	
	@RequestMapping("/processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from the HTML form
		String theNameString =  request.getParameter("studentName");
		
		//convert the data to all caps
		theNameString = theNameString.toUpperCase();
		//create a message
		String resultString = "Yo!"+theNameString;
		//add message to the model
		model.addAttribute("message",resultString);
		
		return "helloWorld";
		}

}
