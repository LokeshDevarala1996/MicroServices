package com.project.management.dao.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.project.management.dao.ManagementDao;
import com.project.management.model.Address;
import com.project.management.model.Project;
import com.project.management.model.Resource;
import com.project.management.model.Task;

@Repository
public class ManagementDaoImpl implements ManagementDao {
	
	public List<Task> tasks=new LinkedList<>();
	public List<Project> projects=new ArrayList<>();
	public List<Resource> resources =  new ArrayList<>();
	public List<Address> addresses = new ArrayList<>();

	@Override
	public List<Task> getTasksDetails() {
		// TODO Auto-generated method stub
		return tasks;
	}

	@Override
	public String createTask(Task task) {
		// TODO Auto-generated method stub
		boolean isMatch=tasks.stream().anyMatch(e->e.getName().equalsIgnoreCase(task.getName()));
		if(isMatch) {
			return "Already Existing";
		}
		tasks.add(task);
		return "Success";
	}

	@Override
	public List<Task> getTask(String taskName) {
		// TODO Auto-generated method stub
		List<Task> task= tasks.stream().filter(e->e.getName().equalsIgnoreCase(taskName)).collect(Collectors.toList());
		return task;
	}

	@Override
	public String createProject(Project project) {
		// TODO Auto-generated method stub
		boolean isMatch=projects.stream().anyMatch(e->e.getProjectName().equalsIgnoreCase(project.getProjectName()));
		if(isMatch) {
			return "Already Existing";
		}
		projects.add(project);
		return "Successfully inserted";
		//return null;
	}

	@Override
	public Project getProject(String projectName) {
		// TODO Auto-generated method stub
		List<Project> project= projects.stream().filter(e->e.getProjectName().equalsIgnoreCase(projectName)).collect(Collectors.toList());
		return project.get(0);
	}
	

}
