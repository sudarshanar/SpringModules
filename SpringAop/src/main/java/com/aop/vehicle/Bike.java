package com.aop.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bike {
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

	public void drift() {
		System.out.println("Business Logic for Drift speed is : ");
	}

	public void stop() {
		System.out.println("Business Logic for Stop");
	}
}
