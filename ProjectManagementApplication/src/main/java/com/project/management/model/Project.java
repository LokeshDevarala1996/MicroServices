package com.project.management.model;

import java.util.List;

public class Project {
	
	private String projectName;
	private String projectOwner;
	private List<Resource> resources;
	private List<Task> tasks;
    private String projectDescription;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectOwner() {
		return projectOwner;
	}
	public void setProjectOwner(String projectOwner) {
		this.projectOwner = projectOwner;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public Project(String projectName, String projectOwner, List<Resource> resources, List<Task> tasks,
			String projectDescription) {
		super();
		this.projectName = projectName;
		this.projectOwner = projectOwner;
		this.resources = resources;
		this.tasks = tasks;
		this.projectDescription = projectDescription;
	}
    
    public Project() {
    	
    }
    
}
