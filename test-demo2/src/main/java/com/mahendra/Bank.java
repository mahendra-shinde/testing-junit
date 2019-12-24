package com.mahendra;

import java.util.List;

public class Bank {
	private List<Account> accounts;

	public Bank(List<Account> accounts) {
		super();
		this.accounts = accounts;
	}
	
	Account findAccount(String accNo) {
		for(Account a: accounts) {
			if(a.getAccNo().equalsIgnoreCase(accNo))
			{
				return a;
			}
		}
		return null;
	}
	
	boolean withdraw(String accNo, double amt) {
		Account acc = findAccount(accNo);
		acc.setBalance(acc.getBalance()-amt);
		return true;
	}
	
	boolean deposit(String accNo, double amt) {
		Account acc = findAccount(accNo);
		acc.setBalance(acc.getBalance()+amt);
		return true;
	}
}
