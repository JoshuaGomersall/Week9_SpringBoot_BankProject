package com.qa.accounts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class AccountGeneratorTests {
	
	ApplicationContext ac;
	AccountNumberGenerator gen; 
	AccountsHashmap ah ;
	@Before
	public void setUp() {
		ac = SpringApplication.run(SpringBootAccountsApplication.class);
		gen = (AccountNumberGenerator) ac.getBean("accountNumberGenerator");
		ah = (AccountsHashmap) ac.getBean("accountsHashmap");
	}
	

	
	public void accountAddTest() {
		ah.accounts.put("a6789623","Josh Gom");
		assertEquals(true,ah.accounts.containsKey("a6789623"));		
	}
	
//	@Test
//	public void a() {
//		assertEquals(7,numGen(6));
//	}

}
