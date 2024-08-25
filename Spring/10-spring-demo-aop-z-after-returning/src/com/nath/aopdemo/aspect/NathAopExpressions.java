package com.nath.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class NathAopExpressions {
	
	@Pointcut("execution(* com.nath.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// create pointcut for getter method
	@Pointcut("execution(* com.nath.aopdemo.dao.*.get*(..))")
	public void getter() {}
	
	// create pointcut for setter method
	@Pointcut("execution(* com.nath.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	// create pointcut: include package...exclude getter/setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}

}
