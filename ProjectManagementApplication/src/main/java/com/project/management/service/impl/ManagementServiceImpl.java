package com.project.management.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.management.dao.ManagementDao;
import com.project.management.model.Project;
import com.project.management.model.Task;
import com.project.management.service.ManagementService;

@Service
public class ManagementServiceImpl implements ManagementService{

	@Autowired
	private ManagementDao managementDao;
	
	@Override
	public List<Task> getAllTaskDetails() {
		// TODO Auto-generated method stub
		List<Task> allTasksDetails = managementDao.getTasksDetails();
		return allTasksDetails;
	}

	@Override
	public String createTask(Task taskDetails) {
		// TODO Auto-generated method stub
		String result=managementDao.createTask(taskDetails);
		return result;
	}

	@Override
	public List<Task> getTask(String taskName) {
		// TODO Auto-generated method stub
		 return managementDao.getTask(taskName);
	}

	@Override
	public String createProject(Project project) {
		// TODO Auto-generated method stub
		return managementDao.createProject(project);
	}

	@Override
	public Project getProject(String projectName) {
		// TODO Auto-generated method stub
		return managementDao.getProject(projectName);
	}

}
