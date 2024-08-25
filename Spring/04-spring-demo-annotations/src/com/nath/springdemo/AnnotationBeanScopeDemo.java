package com.nath.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// ckeck if thay are same
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\nPointing to the same object: "+result);
		
		System.out.println("\nMemory loc for theCoach "+theCoach);
		
		System.out.println("\nMemory loc for theCoach "+alphaCoach+"\n");
		
		// close the context
		context.close();
	}

}
