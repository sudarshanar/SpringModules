package com.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Controller {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("constructorInjectionAppContext.xml");

		/*
		 * Fruit fruite = context.getBean("fruitNamewithListAndMap", Fruit.class);
		 * Vegetable veg = context.getBean("veg", Vegetable.class); fruite.display();
		 * veg.test();
		 */
		Salad salad = context.getBean("conSalad", Salad.class);
		salad.displaySalad();
	}

}
