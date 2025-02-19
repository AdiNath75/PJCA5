package com.adi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve bean from Spring container
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// check if they are same
		boolean result = (theCoach == alphaCoach);
		
		//print result
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory location for theCoach: "+theCoach);

		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);

		
	}

}
