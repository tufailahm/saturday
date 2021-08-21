package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.revature.ems.config.AppConfig;
import com.revature.ems.model.Email;

/**
 * Spring demo1
 *
 */
public class App {
	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		
		Email email = (Email) context.getBean("email");
	
		System.out.println(email);
		
		context.registerShutdownHook();

	}
}
