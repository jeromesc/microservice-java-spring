package com.nbfg.innolab.microservice.account.domain;

public class Account {

	private long id;
	
	private String name;
	
	private double balance;
	
	private CurrencyType currency;
	
	private AccountType type;
	
	public void setId(long id) {
		this.id = id;
	}	
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public CurrencyType getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyType currency) {
		this.currency = currency;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
	
}
