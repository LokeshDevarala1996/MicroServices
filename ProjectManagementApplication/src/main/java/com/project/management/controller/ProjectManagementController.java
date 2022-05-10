package com.project.management.controller;

import java.util.List;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.management.model.Task;
import com.project.management.service.ManagementService;

@RestController
public class ProjectManagementController {
	
	@Autowired
	private ManagementService projectManagementService;
	

	@GetMapping(value = "/allTasks", produces=MediaType.APPLICATION_JSON)
	public List<Task> getAllTasks(){
		
		return projectManagementService.getAllTaskDetails();
		
	}
	
	@PostMapping(value = "/task", consumes = MediaType.APPLICATION_JSON)
	public String createTask(@RequestBody Task taskDetails){
		
		return projectManagementService.createTask(taskDetails);
		
	}
	
	@GetMapping(value = "/task/{taskName}", produces=MediaType.APPLICATION_JSON)
	public List<Task> getTask(@PathVariable(value = "taskName") String taskName){
		
		return projectManagementService.getTask(taskName);
		
	}
	
	
}
