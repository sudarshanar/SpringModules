package com.spring.completeAnnotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	private String street;
	private String pin;

	public Address() {
		super();
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pin=" + pin + "]";
	}

	public String getStreet() {
		return street;
	}

	@Autowired
	public void setStreet(@Value("Hassan") String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	@Autowired
	public void setPin(@Value("560070") String pin) {
		this.pin = pin;
	}
}
