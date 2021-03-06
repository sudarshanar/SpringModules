package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FirstController {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new FileSystemXmlApplicationContext("appContext.xml");
		/*
		 * Fruit fruite = context.getBean("fruitNamewithListAndMap", Fruit.class);
		 * Vegetable veg = context.getBean("veg", Vegetable.class); fruite.display();
		 * veg.test();
		 */
		Salad salad = (Salad) context.getBean("salad", Salad.class);
		salad.displaySalad();

	}

}
