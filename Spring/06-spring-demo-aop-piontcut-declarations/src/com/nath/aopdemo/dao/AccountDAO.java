package com.nath.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.nath.aopdemo.Account;

@Component
public class AccountDAO {
	
	public void addAccount(Account theAccount, boolean vip) {
		
		System.out.println(getClass() + ": DOING MY WORK: ADDING AN ACCOUNT");
	}
	
	public boolean doWork() {
		
		System.out.println(getClass() + ": doWork()");
		return false;
	}

}
