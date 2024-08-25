package com.nath.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nath.aopdemo.dao.AccountDAO;
import com.nath.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get membership from spring container
		MembershipDAO theMembershipDAO = 
				context.getBean("membershipDAO", MembershipDAO.class);
		
		// call the buisness method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true );
		theAccountDAO.doWork();
		
		// call the accounts getters/setters 
		theAccountDAO.setName("Foobar");
		theAccountDAO.setServiceCode("Silver");
		
		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();
		
		// call the membership buisness method
		theMembershipDAO.addAbc();
		theMembershipDAO.goToSleep();
		
		// close the context
		context.close();
	}

}
