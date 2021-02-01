package com.spring.completeAnnotated;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employee")
public class Employee {
	private String ename;
//	@Autowired
	@Inject
	@Named("address")
	private Address address;

	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", address=" + address + "]";
	}

	public String getEname() {
		return ename;
	}

	@Autowired
	public void setEname(@Value("Sam") String ename) {
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
		// TODO Auto-generated constructor stub
	}
}
