package com.qa.accounts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class AccountGeneratorTests {
	
	@Before
	public void setUp() {
		ApplicationContext ac = SpringApplication.run(SpringBootAccountsApplication.class, args);
		AccountNumberGenerator gen = (AccountNumberGenerator) ac.getBean("accountNumberGenerator");
	}
	
	@Test
	public void a() {
		assertEquals(7,numGen(6));
	}

}
