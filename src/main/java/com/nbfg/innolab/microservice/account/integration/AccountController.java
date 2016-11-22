package com.nbfg.innolab.microservice.account.integration;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nbfg.innolab.microservice.account.domain.Account;
import com.nbfg.innolab.microservice.account.repository.AccountRepository;
import com.nbfg.innolab.microservice.account.utils.HttpRequestHelper;
import com.nbfg.innolab.microservice.account.utils.NullAccount;
import com.nbfg.innolab.microservice.account.utils.UserNotInHeaderException;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	private AccountRepository repository;
	
	/**
	 * List is the preferred structure.
	 * @return
	 */
	@RequestMapping("/")
	public List<Account> getAccounts() 
	{
		try 
		{
			String userId = HttpRequestHelper.extractUserFromRequest();
			//return repository.findAllAccountsForUser(userId);
		} 
		catch (UserNotInHeaderException unee) 
		{
			
		}
		// Returns an immutable empty list
		return Collections.emptyList();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Account getAccountDetails(@PathVariable("id") long id) 
	{
		return NullAccount.emptyAccount();
	}
	
	
	/*
	@RequestMapping()
	public List<Account> modifyAccount() {
		return null;
		
	}
	
	@RequestMapping()
	public List<Account> createAccount() {
		return null;
		
	}
	
	@RequestMapping()
	public List<Account> deleteAccount() {
		return null;
		
	}	
	*/
}
