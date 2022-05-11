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
public class Resource {
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("name")
	private String name;
	@JsonProperty("designation")
	private String designation;
	@JsonProperty("age")
	private int age;
	@JsonProperty("address")
	private Address address;
	@JsonProperty("taskDetails")
	private List<Task> taskDetails;
	
	
}
