package com.spring.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Register {
	@Autowired
	private Employee emp;
	@Autowired
	private Address add;

	public Register() {
		super();
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Register [emp=" + emp + ", add=" + add + "]";
	}

	public void Display() {
		System.out.println(emp.getEname() + " : " + emp.getAddress().getStreet() + " : " + emp.getAddress().getPin());
		System.out.println(add.getStreet() + " : " + add.getPin());
	}
}
