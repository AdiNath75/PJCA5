package com.zip.rest.config;

// Java Program to Illustrate
// SpringMvcDispatcherServletInitializer Class

// Importing required classes
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Class
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Method 1
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// Method 2
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { AppConfig.class };
	}

	// Method 3
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
