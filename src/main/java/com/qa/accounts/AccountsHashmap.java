package com.qa.accounts;

import java.util.HashMap;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AccountsHashmap {
	
	public static HashMap<String,String> accounts = new HashMap<String,String>();
	
	public String addToMap(String fore, String sure, String accountNum) {
		if (accounts.containsKey(accountNum) == false) {
			accounts.put(accountNum, fore + " " + sure);
			return "Account added";
		} else {
			return "Account number already exists";			
		}
		
	}
	
	

}
