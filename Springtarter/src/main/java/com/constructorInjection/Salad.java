package com.constructorInjection;

public class Salad {
	private Fruit fruit;
	private Vegetable vegetable;

	public Salad() {
		super();
	}

	public Salad(Fruit fruit, Vegetable vegetable) {
		super();
		this.fruit = fruit;
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
