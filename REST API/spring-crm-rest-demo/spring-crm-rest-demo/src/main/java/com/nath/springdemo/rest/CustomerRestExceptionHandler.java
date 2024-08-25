package com.nath.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nath.springdemo.entity.Customer;

@ControllerAdvice
public class CustomerRestExceptionHandler {
	
	// Add an exception handler for CustomerNotFoundException
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponce> handleException(CustomerNotFoundException exc){
		
		// create CustomerErrorResponce
		CustomerErrorResponce error = new CustomerErrorResponce(
						HttpStatus.NOT_FOUND.value(),
						exc.getMessage(),
						System.currentTimeMillis()
						);
		
		// return ResponceEntity
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	// Add another exception handler ..to catch exception
	
	@ExceptionHandler
	public ResponseEntity<CustomerErrorResponce> handleException(Exception exc){
		
		// create CustomerErrorResponce
		CustomerErrorResponce error = new CustomerErrorResponce(
						HttpStatus.BAD_REQUEST.value(),
						exc.getMessage(),
						System.currentTimeMillis()
						);
		
		// return ResponceEntity
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
	
}
