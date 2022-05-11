package com.project.management.service;

import java.util.List;

import com.project.management.model.Project;
import com.project.management.model.Task;

public interface ManagementService {
	public List<Task> getAllTaskDetails();
	public String createTask(Task taskDetails);
	public List<Task> getTask(String taskName,String projectName);
	public Project getProject(String projectName);
	public String createProject(Project project);
	public boolean isProjectCompleteByDate(String projectNAme,String date);
	public String projectExpectedDateofCompletion(String projectNAme);

}
