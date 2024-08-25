package com.nath.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	// we add all of our related advice for logging
	
	// start with @Before advice
	
	//@Before("execution(public void add*())")
	
	@Pointcut("execution(* com.nath.aopdemo.dao.*.*(..))")
	private void forDaoPackage() {}
	
	@Before("forDaoPackage()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n====>>> Executing @Before advice on addAccount()");

	}
	
	@Before("forDaoPackage()")
	public void performApiAnalyst() {
		
		System.out.println("\n====>>> Performing API analytics");
	}
	

}
