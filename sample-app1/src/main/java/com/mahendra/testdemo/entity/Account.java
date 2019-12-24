package com.mahendra.testdemo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedQuery(name="find",
	query="SELECT acct from Account acct WHERE acct.username = :username")
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "First_Name")
	private String firstname;
	
	@Column(name = "Last_Name")
	private String lastname;
	
	private String username;

	@OneToMany(mappedBy="account", cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = RewardTransaction.class)
	private List<RewardTransaction> transactions = new ArrayList<RewardTransaction>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public BigDecimal getRewardPoint() {
		return transactions.stream().map(RewardTransaction::getAmount)
        .reduce(BigDecimal.ZERO, BigDecimal::add);  
		 
	}

	public List<RewardTransaction> getTransactions() {
		return transactions;
	}

	public void addTransactions(RewardTransaction transaction) {
		transaction.setAccount(this);
		this.transactions.add(transaction);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
