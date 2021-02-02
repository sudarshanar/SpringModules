package com.spring.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class Account {
	@Size(min=3,max=10)
	@NotNull
	private String uname;
	@Email
	private String email;
	@Size(min=5,max=8)
	@NotNull
	private String pass;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String uname, String email, String pass) {
		super();
		this.uname = uname;
		this.email = email;
		this.pass = pass;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Account [uname=" + uname + ", email=" + email + ", pass=" + pass + "]";
	}
}
