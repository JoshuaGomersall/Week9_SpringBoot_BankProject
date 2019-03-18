package com.qa.accounts;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AccountPrizes {

	@Scope("prototype")
	public String prizes(String account) {
		if (account.length() == 7) {
			if (account.substring(0, 1).equals("a")) {
				return "Nothing";
			} else if (account.substring(0, 1).equals("b")) {
				return "$50";
			}
			if (account.substring(0, 1).equals("c")) {
				return "$100";
			}
		} else if (account.length() == 9) {
			if (account.substring(0, 1).equals("a")) {
				return "Nothing";
			} else if (account.substring(0, 1).equals("b")) {
				return "$500";
			}
			if (account.substring(0, 1).equals("c")) {
				return "$1,000";
			}
		} else if (account.length() == 11) {
			if (account.substring(0, 1).equals("a")) {
				return "Nothing";
			} else if (account.substring(0, 1).equals("b")) {
				return "$5,000";
			}
			if (account.substring(0, 1).equals("c")) {
				return "$10,000";
			}
		}
		return "Nothing";
	}

}
