package com.spring.JavaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "com.spring.javaConfiguration" })
public class MyConfig {
	@Bean
	public Address address() {
		Address add = new Address();
		add.setPin("560070");
		add.setStreet("44 street");
		return add;
	}

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setAddress(address());
		emp.setEname("Sudarshan");
		return emp;
	}

	/*
	 * @Bean public Register getRegister() { Register reg = new Register();
	 * reg.setAdd(getAddress()); reg.setEmp(getEmployee()); return reg; }
	 */
}
