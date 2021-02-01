package com.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Salad {
	@Autowired
	private Fruit fruit;
//	@Resource
//	@Inject
	@Autowired
//	@Named("veg")
	private Vegetable vegetable;

	public Salad() {
		super();
	}

	public Salad(Fruit fruit, Vegetable vegetable) {
		super();
		this.fruit = fruit;
		this.vegetable = vegetable;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}

	public Vegetable getVegetable() {
		return vegetable;
	}

	public void setVegetable(Vegetable vegetable) {
		this.vegetable = vegetable;
	}

	public void displaySalad() {
		fruit.display();
		vegetable.test();
	}

	@Override
	public String toString() {
		return "Salad [fruit=" + fruit + ", vegetable=" + vegetable + "]";
	}
}
