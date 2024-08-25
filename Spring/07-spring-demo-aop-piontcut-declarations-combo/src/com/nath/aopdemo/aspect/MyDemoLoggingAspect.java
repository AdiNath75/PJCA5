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
	
	// create pointcut for getter method
	@Pointcut("execution(* com.nath.aopdemo.dao.*.get*(..))")
	private void getter() {}
	
	// create pointcut for setter method
	@Pointcut("execution(* com.nath.aopdemo.dao.*.set*(..))")
	private void setter() {}
	
	// create pointcut: include package...exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void forDaoPackageNoGetterSetter() {}
	
	
	@Before("forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
	}
	
	@Before("forDaoPackageNoGetterSetter()")
	public void performApiAnalyst() {
		
		System.out.println("\n====>>> Performing API analytics");
	}
	

}
