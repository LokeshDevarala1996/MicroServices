package com.project.management.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resource {
	@JsonProperty("name")
	private String name;
	@JsonProperty("designation")
	private String designation;
	@JsonProperty("age")
	private int age;
	@JsonProperty("address")
	private Address address;
	@JsonProperty("taskDetails")
	private HashMap<String, Integer> taskDetails;

}
