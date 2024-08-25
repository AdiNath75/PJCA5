package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	public static void main(String[] args) {
		  //Get ApplicationContext using spring configuration file.
	  ApplicationContext context = 
		new ClassPathXmlApplicationContext("spring.xml");
	 
	  //Get HelloWorld bean object from ApplicationContext instance. 
	  Test helloWorld = (Test) context.getBean("helloWorld");
	 
	  //Call sayHello method of HelloWorld bean.
	  helloWorld.sayHello();
	 } 

}
