package com.spring.JavaConfiguration;

import org.springframework.stereotype.Component;

@Component
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

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
}
