package com.qa.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAccountsApplication {

	public static void main(String[] args) {
		
		
		ApplicationContext ac = SpringApplication.run(SpringBootAccountsApplication.class, args);
		INumGen gen = (INumGen) ac.getBean("accountNumberGenerator");
		AccountPrizes prize = (AccountPrizes) ac.getBean("accountPrizes");
		System.out.println(gen.generateNumber());
		System.out.println(prize.prizes(gen.generateNumber()));
		System.out.println(prize.prizes(gen.generateNumber()));
	}

}
