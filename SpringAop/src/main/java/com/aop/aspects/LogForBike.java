package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogForBike {
	@Before("execution(public void dr*())")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("Starting methods with dr");
		
	}

	/*
	 * @Pointcut("execution(* dr*(..))") public void methodsStartsWith_dr() {
	 * 
	 * }
	 */
	
	@After("execution(* st*()) || execution(public String dr*(..))")
	public void vehicleWithPerticularConsraint(JoinPoint jp) {
		System.out.println("Ending methods starts with St or dr with String returntype");
		
	}
}
