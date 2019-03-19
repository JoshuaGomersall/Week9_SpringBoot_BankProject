package com.qa.accounts;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public INumGen accountNumberGenerator() {
		return new SixNumGen();
	}
	
}
