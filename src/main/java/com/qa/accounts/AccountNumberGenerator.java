package com.qa.accounts;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AccountNumberGenerator {
	
	@Scope("prototype")
	public String numGen(int length) {
		String str = "abc";
		char letterPart = str.charAt(ThreadLocalRandom.current().nextInt(0, 3));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, length-1), Math.pow(10, length));
		return letterPart +""+ numberPart;
	}

}
