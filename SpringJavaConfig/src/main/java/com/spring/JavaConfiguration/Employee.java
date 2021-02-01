package com.spring.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String ename;
	@Autowired
	private Address address;

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", address=" + address + "]";
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee() {
		super();
	}
}
