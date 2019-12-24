package com.mahendra.testdemo.model;

import com.mahendra.testdemo.entity.Account;

public class User {

	private String userName;

	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
