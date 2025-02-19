package com.nath.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName, lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favouriteLanguage;
	
	private LinkedHashMap<String, String> favouriteLanguageOptions;
	
	private String[] operatingSystems;

	
	
	public Student() {
		
		// populate country options : usd ISO country code
		countryOptions  = new LinkedHashMap<>();
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("CAN", "Canada");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("GE", "Germany");
		
		// populate favorite language options
		favouriteLanguageOptions = new LinkedHashMap<>();

		// parameter order: value, display label
		//
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("C#", "C#");
		favouriteLanguageOptions.put("PHP", "PHP");
		favouriteLanguageOptions.put("Ruby", "Ruby");
		
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

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	
	}
	
	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	

}
