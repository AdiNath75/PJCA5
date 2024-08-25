package com.adi.springdemo;

public class MyApp {
	public static void main(String[] args) {
		//Crate the Object
		Coach theCoach = new TrackCoach();
		//Use the Object
		System.out.println(theCoach.getDailyWorkOut());	
	}
}
