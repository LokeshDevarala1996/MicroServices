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

import com.project.management.model.Project;
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
	
	@GetMapping(value = "/task/{projectName}/{taskName}", produces=MediaType.APPLICATION_JSON)
	public List<Task> getTask(@PathVariable(value = "taskName") String taskName, @PathVariable(value="projectName") String projectName){
		
		return projectManagementService.getTask(taskName,projectName);
		
	}
	
	@PostMapping(value = "/project", consumes = MediaType.APPLICATION_JSON)
	public String createProject(@RequestBody Project projectDetails){
		
		return projectManagementService.createProject(projectDetails);
		
	}
	
	@GetMapping(value = "/project", produces=MediaType.APPLICATION_JSON)
	public Project getProject(@PathVariable(value = "projectName") String projectName){
		
		return projectManagementService.getProject(projectName);
		
	}
	
	@PostMapping(value = "/projectEta", produces=MediaType.APPLICATION_JSON)
	public String getProjectEta(@RequestBody String projectName){
		
		return projectManagementService.projectExpectedDateofCompletion(projectName);
		
	}
	
	@GetMapping(value = "/projectCompleteByDate/{projectName}/{expectedDate}", produces=MediaType.APPLICATION_JSON)
	public String projectCompleteByDate(@PathVariable(value = "projectName") String projectName,@PathVariable(value = "expectedDate") String expectedDate){
		
		if(projectManagementService.isProjectCompleteByDate(projectName, expectedDate)) {
			return "yes we able to complete by given date";
		}else {
			return "No, still we need some more days to complete";
		}
		
	}
	

	
	
}
