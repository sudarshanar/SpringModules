package com.spring.completeAnnotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class AnnotationController {

	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("annotationAppContext.xml");
		Register register = context.getBean("register", Register.class);
		register.Display();
	}

}
