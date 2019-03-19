package com.qa.accounts;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

public class AccountNumberGenerator {
	
	public String numGen6() {
		String str = "abc";
		char letterPart = str.charAt(ThreadLocalRandom.current().nextInt(0, 3));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, 5), Math.pow(10, 6));
		return letterPart +""+ numberPart;
	}
	
	public String numGen8() {
		String str = "abc";
		char letterPart = str.charAt(ThreadLocalRandom.current().nextInt(0, 3));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, 7), Math.pow(10, 8));
		return letterPart +""+ numberPart;
	}
	
	public String numGen10() {
		String str = "abc";
		char letterPart = str.charAt(ThreadLocalRandom.current().nextInt(0, 3));
		int numberPart = (int) ThreadLocalRandom.current().nextDouble(Math.pow(10, 9), Math.pow(10, 10));
		return letterPart +""+ numberPart;
	}

}
