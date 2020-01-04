package com.cognizant.javabean;

import java.util.Date;

public class Employee {
	private String name;
	private String id;
	private String gender;
	private String dateOfBirth;
	private String fullTimeEmployee;
	private String department;

	public Employee(String name, String id, String gender, String dateOfBirth, String fullTimeEmployee,
			String department) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.fullTimeEmployee = fullTimeEmployee;
		this.department = department;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getFullTimeEmployee() {
		return fullTimeEmployee;
	}

	public void setFullTimeEmployee(String fullTimeEmployee) {
		this.fullTimeEmployee = fullTimeEmployee;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
