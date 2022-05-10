package com.project.management.dao;

import java.util.List;

import com.project.management.model.Task;

public interface ManagementDao {
	
	public List<Task> getTasksDetails();
	public String createTask(Task task);
	public List<Task> getTask(String taskName);

}
