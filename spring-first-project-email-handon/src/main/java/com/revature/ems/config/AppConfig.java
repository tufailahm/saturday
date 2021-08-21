package com.revature.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.ems.model.Email;
import com.revature.ems.model.From;
import com.revature.ems.model.To;

@Configuration
public class AppConfig {

	
	@Bean
	public Email email() {
		return new Email();
	}
	
	@Bean
	public To to() {
		return new To("Tufail","t@a.com");
	}
	
	@Bean
	public From from() {
		return new From();
	}
	
}
