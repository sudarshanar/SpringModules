package com.aop.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	public void drive() {
		System.out.println("Business Logic for Drive");
	}

	public void drive(int maxSpeed) {
		System.out.println("Business Logic for Drive with maxSpeed : " + maxSpeed);
	}

	public String drive(String shoutWithotWindow) {
		System.out.println("Business Logic for Drive with shoutWithotWindow : " + shoutWithotWindow);
		return "Shout";
	}
}
