package com.project.management.model;

import java.util.HashMap;

public class Resource {

	private String name;
	private String designation;
	private int age;
	private Address address;
	private HashMap<String, Integer> taskDetails;

	public HashMap<String, Integer> getTaskDetails() {
		return taskDetails;
	}

	public void setTaskDetails(HashMap<String, Integer> taskDetails) {
		this.taskDetails = taskDetails;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Resource [name=" + name + ", age=" + age + ", address=" + address + ", taskDetails=" + taskDetails
				+ "]";
	}

	public Resource(String name, String designation, int age, Address address, HashMap<String, Integer> taskDetails) {
		super();
		this.name = name;
		this.designation = designation;
		this.age = age;
		this.address = address;
		this.taskDetails = taskDetails;
	}

	public Resource() {

	}

}
