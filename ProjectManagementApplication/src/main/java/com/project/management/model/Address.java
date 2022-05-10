package com.project.management.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Address {
	@JsonProperty("Street")
	private String Street;
	@JsonProperty("city")
	private String city;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonProperty("country")
	private String country;
	@JsonProperty("pincode")
	private String pincode;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public Address(String street, String city, String country, String pincode) {
		super();
		Street = street;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		
	}

}
