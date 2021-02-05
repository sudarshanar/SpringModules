package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LogForBus {
//	@Before("execution(public void dr*())")
	@Before("args()")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("Starting Drivev with no param");
		
	}
	
	/*
	 * @Before("execution(public String dr*(String))") public void
	 * vehicleAboutToMoveWith2Params(JoinPoint jp) {
	 * System.out.println("Parameters with 2 params");
	 * 
	 * }
	 */

	/*
	 * @Pointcut("execution(* dr*(..))") public void methodsStartsWith_dr() {
	 * 
	 * }
	 */
	
	@After("execution(* st*()) || execution(* *(..))")
	public void vehicleWithPerticularConsraint(JoinPoint jp) {
		System.out.println("Ending methods starts with St or dr with String returntype");
		
	}
}
