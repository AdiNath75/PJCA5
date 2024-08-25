package com.nath.aopdemo.aspect;

import java.util.Iterator;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.nath.aopdemo.Account;

@Aspect
@Component
@Order(2)
public class MyDemoLoggingAspect {
	
	
	@Before("com.nath.aopdemo.aspect.NathAopExpressions.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdvice(JoinPoint theJointPoint) {
		
		System.out.println("\n====>>> Executing @Before advice on addAccount()");
		
		// display method signature
		MethodSignature methodSign = (MethodSignature) theJointPoint.getSignature();
		
		System.out.println("Method: " + methodSign);
		
		// display method arguments
		
		// get args
		Object[] args = theJointPoint.getArgs();
		
		// loop thru args
		for (Object tempArg : args) {
			System.out.println(tempArg);
			
			if(tempArg instanceof Account) {
				
				// downcast and print account specific stuff
				Account theAccount = (Account) tempArg;
				
				System.out.println("account name: " +theAccount.getName());
				
				System.out.println("account level: " + theAccount.getLevel());
			}
		}
	}
}
