package com.nath.aopdemo.aspect;

import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
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
	
	@After("execution (* com.nath.aopdemo.dao.AccountDAO.findAccounts(..))")
	public void afterFinallyFindAccountAdvice(JoinPoint theJoinPoint) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n====>>> Exercuting @After (finally) on method: "
							+ method);
	}
	
	@AfterThrowing(
			pointcut = "execution (* com.nath.aopdemo.dao.AccountDAO.findAccounts(..))",
			throwing = "theExc"
			)
	public void afterThrowingFindAccontAdvice(
					JoinPoint theJoinPoint, Throwable theExc) {
		
		// print out which method we are advising on
		String method = theJoinPoint.getSignature().toShortString();
		System.out.println("\n====>>> Exercuting @AfterThrowing on method: " + method);
		
		// log the exception
		System.out.println("\n====>>> the exception is: " + theExc);

	}
	
	// add a new advice for @AfterReturning on the findAccounts method
	@AfterReturning(
			pointcut = "execution (* com.nath.aopdemo.dao.AccountDAO.findAccounts(..))",
			returning = "result"
			)
	public void afterReturningFindAccountsAdvice(
				JoinPoint theJoinPoints, List<Account> result) {
		
		// print out which method we are advising on
		String method = theJoinPoints.getSignature().toShortString();
		System.out.println("\n====>>> Exercuting @AfterReturning on method: " + method);
		
		// print out the results of method call
		System.out.println("\n====>>> result is: " + result);
		
		// let's post-process the data ... let's modify it
		
		// convert account names to uppercase
		convertAccountNamesToUpperCase(result);
		
		System.out.println("\n====>>> result is: " + result);
		
	}
	
	private void convertAccountNamesToUpperCase(List<Account> result) {
		
		// loop thru accounts
		for (Account tempAccount : result) {
			
			// get uppercase version of name
			String theUpperName = tempAccount.getName().toUpperCase();
			
			// update the name on account
			tempAccount.setName(theUpperName);
		}
	}

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
