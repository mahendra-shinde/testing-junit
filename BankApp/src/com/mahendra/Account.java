package com.mahendra;

public class Account {
	private String accHolder;
	private String accNo;
	private Double balance;
	
	static final double MIN_BALANCE=1000;
	
	public String getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Account(String accHolder, String accNo, Double balance) {
		super();
		this.accHolder = accHolder;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	
}
