package com.nath.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring cong java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		// Coach theCoach = context.getBean("thatSillyCoach", Coach.class); //for explicit id
		
		// for default id
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
