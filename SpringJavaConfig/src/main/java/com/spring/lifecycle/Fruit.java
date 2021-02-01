package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Fruit {
	private String fruitName;
	private String fruitColor;

	public Fruit() {

	}

	public String getFruitName() {
		return fruitName;
	}

	@Required
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitColor() {
		return fruitColor;
	}

	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}

	@Override
	public String toString() {
		return "Fruit [fruitName=" + fruitName + ", fruitColor=" + fruitColor + "]";
	}

	public String disp() {
		return this.toString();
	}

	// notworking
	@PostConstruct
	public void init() {
		System.out.println("Initializing contex");
	}

	// notworking
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying context");
	}
}