package com.autowiring;

public class Vegetable {
	private String name;
	private String colour;
	
	public Vegetable() {
		
	}

	public Vegetable(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vegetable [name=" + name + ", colour=" + colour + "]";
	}

	public void test() {
		System.out.println("New Vegetable name is : "+name+" and its colur is : "+colour);
	}
}
