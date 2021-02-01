package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class LifeCycleController {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		 Fruit fruit = context.getBean("fruitFromlifecycle", Fruit.class);
		 fruit.disp();

	}

}
