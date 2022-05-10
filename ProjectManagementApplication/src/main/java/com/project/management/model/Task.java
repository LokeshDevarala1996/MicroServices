package com.project.management.model;

public class Task {
	private String name;
	private String description;
	private String status;
	private int expectedDaystoComplete;

	public Task(String name, String description, String status, int expectedDaystoComplete) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
		this.expectedDaystoComplete = expectedDaystoComplete;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getExpectedDaystoComplete() {
		return expectedDaystoComplete;
	}

	public void setExpectedDaystoComplete(int expectedDaystoComplete) {
		this.expectedDaystoComplete = expectedDaystoComplete;
	}

	@Override
	public String toString() {
		return "Task [name=" + name + ", description=" + description + ", expectedDaystoComplete="
				+ expectedDaystoComplete + "]";
	}

	public Task() {

	}

}
