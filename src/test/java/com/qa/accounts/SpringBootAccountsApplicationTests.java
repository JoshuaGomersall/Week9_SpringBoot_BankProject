package com.qa.accounts;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootAccountsApplicationTests {

	@Ignore
	@Test
	public void contextLoads() {
	}
	
	
	ApplicationContext ac;
	AccountNumberGenerator gen; 
	AccountsHashmap ah ;
	@Before
	public void setUp() {
		ac = SpringApplication.run(SpringBootAccountsApplication.class);
		gen = (AccountNumberGenerator) ac.getBean("accountNumberGenerator");
		ah = (AccountsHashmap) ac.getBean("accountsHashmap");
	}
	
	@Test
	public void accountAddTest() {
		ah.accounts.put("a67896232","Josh Gom");
		assertEquals(true,ah.accounts.containsKey("a67896232"));		
	}
	
	@Test
	public void accountAddWithMethdodTest() {
		ah.addToMap("Bruno","Sterner","b012132");
		assertEquals(true,ah.accounts.containsKey("b012132"));		
	}
	
	@Test
	public void accountAddWithNumGenTest() {
		String accountNum = gen.numGen10();
		ah.addToMap("Jordan","Kennear",accountNum);
		assertEquals(true,ah.accounts.containsValue("Jordan Kennear"));		
	}

}
