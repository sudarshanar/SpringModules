package com.spring.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Laptop {
	private int laptopId;
	private String brand;

	public Laptop() {
		super();
	}

	public int getLaptopId() {
		return laptopId;
	}

	@Autowired
	public void setLaptopId(@Value("2001") int laptopId) {
		this.laptopId = laptopId;
	}

	public String getBrand() {
		return brand;
	}

	@Autowired
	public void setBrand(@Value("Apple Macintosh") String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", brand=" + brand + "]";
	}

	public void dispLaptop() {
		System.out.println(this.toString());
	}
}
