package com.cognizant.javabean;

import java.util.Date;

public class Employee {
	private String name;
	private String id;
	private String gender;

	public Employee(String name, String id, String gender) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
