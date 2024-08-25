package com.nath.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	
	public Boolean addAbc() {
		
		System.out.println(getClass() + " :DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
		
		return null;
		
	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + ": I'm going to sleep now..");
		
	}

}
