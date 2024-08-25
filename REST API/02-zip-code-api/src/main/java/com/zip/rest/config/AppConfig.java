package com.zip.rest.config;

// Java Program to Illustrate Application 
// configuration Class

// Importing required classes
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// Annotations
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.zipCode.zipCode_RestAPI" })

// Class
public class AppConfig {

	@Bean
	public InternalResourceViewResolver resolver() {

		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/");
		resolver.setSuffix(".jsp");

		return resolver;
	}
}
