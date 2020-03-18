package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String state;
	private String favoriteLanguage;
	private String favoriteOS;
	
	//Instead of passing options in JSP file for a drop-down list
	private LinkedHashMap<String, String> stateHashMap;
	
	public Student() {
		
		stateHashMap = new LinkedHashMap<String,String>();
		//we can create a linkedHashMap with values filled in and pass it to form directly. 
		stateHashMap.put("har", "Haryana");
		stateHashMap.put("JK", "Jammu&Kashmir");
		stateHashMap.put("UK", "Uttarakhand");
		stateHashMap.put("HP", "Himachal Pradesh");

		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getStateHashMap() {
		return stateHashMap;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFavoriteOS() {
		return favoriteOS;
	}

	public void setFavoriteOS(String favoriteOS) {
		this.favoriteOS = favoriteOS;
	}

	

}
