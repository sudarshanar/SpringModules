package com.aop.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Configuration
public class DispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Inside Dispatcher Servlet");
		return new Class<?>[] { AopConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Inside Dispatcher Servlet");
		return new String[] { "/" };
	}

}
