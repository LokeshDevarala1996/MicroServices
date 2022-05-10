package com.project.management.model;

import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("projectName")
	private String projectName;
	@JsonProperty("projectOwner")
	private String projectOwner;
	@JsonProperty("resources")
	private List<Resource> resources;
	@JsonProperty("tasks")
	private List<Task> tasks;
	@JsonProperty("projectDescription")
    private String projectDescription;
	@JsonProperty("resourceToTaskMapping")
	private HashMap<String,String> resourceToTaskMapping;
}
