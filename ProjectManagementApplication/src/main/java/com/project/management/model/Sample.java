package com.project.management.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;

public class Sample {

	public static void main(String[] args) {
		Project project=new Project();
		project.setProjectName("PMA");
		project.setProjectDescription("Project Management App");
		project.setProjectOwner("XYZ");
		HashMap<String,String> map=new HashMap<>();
		map.put("Lokesh", "create a user story");
		project.setResources(null);
		List<Resource> rsList=new ArrayList();
		Resource rs=new Resource();
		rs.setAge(25);
		rs.setDesignation("Software Developer");
		rs.setName("Lokesh");
		rs.setTaskDetails(null);
		Address address=new Address();
		address.setCity("Nellore");
		address.setCountry("INdia");
		address.setPincode("524322");
		address.setStreet("xyz1");
		rs.setAddress(address);
		Task task=new Task();
		task.setDescription("create a user story");
		task.setExpectedDaystoComplete(4);
		task.setPriority("High");
		task.setDescription("creating a user stoty");
		task.setResourceName("Lokesh");
		task.setStatus("Started");
		task.setType("Story");
		
		List<Task> ts=new ArrayList<>();
		ts.add(task);
		rs.setTaskDetails(ts);
		rsList.add(rs);
		project.setResources(rsList);
		project.setTasks(ts);
		project.setResourceToTaskMapping(map);
	System.out.println(new Gson().toJson(project));
	}
	
}
