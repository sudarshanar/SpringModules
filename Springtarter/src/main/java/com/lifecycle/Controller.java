package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("lifeCycleAppContext.xml");
		Vegetable veg = context.getBean("veg", Vegetable.class);
		veg.disp();
		((FileSystemXmlApplicationContext)context).close();
	}

}
