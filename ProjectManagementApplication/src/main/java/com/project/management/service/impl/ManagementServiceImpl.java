package com.project.management.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
	public List<Task> getTask(String taskName,String projectName) {
		// TODO Auto-generated method stub
		 return managementDao.getTask(taskName,projectName);
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

	@Override
	public boolean isProjectCompleteByDate(String projectName,String date) {
		Project project = managementDao.getProject(projectName);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		boolean result = false;
		try {
			Date endDate= sdf.parse(date);
			Date startDate=sdf.parse(project.getStartDate());
			c.setTime(startDate);
			int days= project.getTasks().stream().mapToInt(e->e.getExpectedDaystoComplete()).sum();
			c.add(Calendar.DAY_OF_MONTH, days);  
			Date newDateNow = c.getTime();
			 result=newDateNow.before(endDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String projectExpectedDateofCompletion(String projectName) {
		// TODO Auto-generated method stub
		Project project = managementDao.getProject(projectName);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		int days= project.getTasks().stream().mapToInt(e->e.getExpectedDaystoComplete()).sum();
		c.add(Calendar.DAY_OF_MONTH, days);  
		Date newDateNow = c.getTime();
		return sdf.format(newDateNow);
	}

}
