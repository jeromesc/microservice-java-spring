package com.nbfg.innolab.microservice.account.utils;

import com.nbfg.innolab.microservice.account.domain.Account;
import com.nbfg.innolab.microservice.account.domain.AccountType;
import com.nbfg.innolab.microservice.account.domain.CurrencyType;

public final class NullAccount {

	private static final long UNDEFINED_ID = 0;
	private static final String UNDEFINED_NAME = "UNDEFINED";

	private static Account nullAccount = new Account();
	
	static 
	{
		nullAccount.setId(UNDEFINED_ID);
		nullAccount.setName(UNDEFINED_NAME);
		nullAccount.setCurrency(CurrencyType.UNDEFINED_CURRENCY);
		nullAccount.setType(AccountType.UNDEFINED_ACCOUNT_TYPE);
	}
	
	
	public static final Account emptyAccount() {
		// TODO Auto-generated method stub
		return nullAccount;
	}
	
}
