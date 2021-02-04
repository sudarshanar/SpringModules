package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.aop.config.AopConfig;
import com.aop.vehicle.Bike;
import com.aop.vehicle.Bus;
import com.aop.vehicle.Car;

public class TestController {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		/*
		 * Car car = context.getBean("car", Car.class); Bike bike =
		 * context.getBean("bike", Bike.class);
		 */
		Bus bus = context.getBean("bus", Bus.class);
//		car.drive();
//		car.stop();
//		car.race(100);
//		bike.drive();
//		bike.drive("Sam");
//		bike.drive(202);
//		bike.drift();
//		bike.stop();
		bus.drive();
		bus.drive("Sam");
		bus.drive(100);
		((AnnotationConfigApplicationContext) context).close();
	}

}
