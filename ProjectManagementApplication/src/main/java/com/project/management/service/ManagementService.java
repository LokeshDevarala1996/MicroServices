package com.project.management.service;

import java.util.List;

import com.project.management.model.Task;

public interface ManagementService {
	public List<Task> getAllTaskDetails();
	public String createTask(Task taskDetails);
	public List<Task> getTask(String taskName);

}
