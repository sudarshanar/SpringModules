package com.aop.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car {
	public void drive() throws Exception {
		if (true)
			System.out.println("Business Logic for Drive");
		else
			throw new Exception();
	}

	public void stop() throws Exception {
		if (true)
			System.out.println("Business Logic for Stop");
		else
			throw new Exception();
	}
	
	public void race(int speed) throws Exception {
		if (speed>150)
			System.out.println("Business Logic for Race speed is : "+speed);
		else
			throw new Exception("you are going slow son");
	}
}
