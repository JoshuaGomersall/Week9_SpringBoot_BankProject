package com.qa.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class NumbergenApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumbergenApplication.class, args);
	}

}
