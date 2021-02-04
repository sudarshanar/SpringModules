package com.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Log {
	@Before("execution(public void drive())")
	public void vehicleAboutToMove(JoinPoint jp) {
		System.out.println("Starting of Drive method");
		System.out.println("JoinPoint Info");
		System.out.println(jp.getTarget());
	}

	@After("execution(public void stop())")
	// @AfterReturning("execution(public void stop())")
	public void vehicleAboutToStop() {
		System.out.println("Ending Of Stop method");
	}

	@AfterThrowing(pointcut = "execution(public void stop())", throwing = "exception")
	public void vehicleAboutToGetException(Exception exception) {
		System.out.println("We Are getting Exception : " + exception);
	}

	@Around("execution(public void race(..))")
	public void vehicleAboutrace(ProceedingJoinPoint pj) {
		System.out.println("Control your speed  and race");
		try {
			pj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("you completed your race successfully");
	}
}
