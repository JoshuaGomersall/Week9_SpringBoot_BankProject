package com.qa.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootAccountsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootAccountsApplication.class, args);
		AccountNumberGenerator gen = (AccountNumberGenerator) ac.getBean("accountNumberGenerator");
		AccountPrizes prize = (AccountPrizes) ac.getBean("accountPrizes");
		System.out.println(gen.numGen(6));
		System.out.println(gen.numGen(6));
		System.out.println(gen.numGen(6));
		System.out.println(prize.prizes(gen.numGen(6)));
		System.out.println(prize.prizes(gen.numGen(7)));
		System.out.println(prize.prizes(gen.numGen(8)));
		System.out.println(prize.prizes(gen.numGen(9)));
		System.out.println(prize.prizes(gen.numGen(10)));
	}

}
