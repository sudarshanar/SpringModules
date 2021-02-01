package com.spring.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class RegisterController {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");

		Register register = (Register) context.getBean("register", Register.class);
		register.dispRegister();
	}
}