package com.spring.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Register {
	private Student student;
	private Laptop laptop;

//	@Autowired(required = false)
	@Autowired
	public Register(Student student, Laptop laptop) {
		super();
		this.student = student;
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Register [student=" + student + ", laptop=" + laptop + "]";
	}

	public void dispRegister() {
		System.out.println(this.toString());
	}
}
