package com.project.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
	@JsonProperty("name")
	private String name;
	@JsonProperty("description")
	private String description;
	@JsonProperty("status")
	private String status;
	@JsonProperty("type")
	private String type;
	@JsonProperty("priority")
	private String priority;
	@JsonProperty("expectedDaystoComplete")
	private int expectedDaystoComplete;
	

}
