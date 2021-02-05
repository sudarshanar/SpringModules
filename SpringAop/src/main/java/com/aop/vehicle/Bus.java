package com.aop.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Bus {
	public void drive1() {
		System.out.println("Business Logic for Drive");
	}

	public void drive1(int maxSpeed) {
		System.out.println("Business Logic for Drive with maxSpeed : " + maxSpeed);
	}

	public String drive1(String shoutWithotWindow) {
		System.out.println("Business Logic for Drive with shoutWithotWindow : " + shoutWithotWindow);
		return "Shout";
	}
}
