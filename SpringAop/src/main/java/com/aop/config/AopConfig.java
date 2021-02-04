package com.aop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.aop.vehicle.Bike;
import com.aop.vehicle.Car;

@Configuration
@ComponentScan(basePackages = { "com.aop" })
public class AopConfig implements WebMvcConfigurer {
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Inside WebMvcConfigure");
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("WEB-INF/jsp/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

	@Bean
	public Car getCar() {
		return new Car();
	}

	@Bean
	public Bike getBike() {
		return new Bike();
	}
	/*
	 * @Bean public Log getLog() { return new Log(); }
	 */
}
