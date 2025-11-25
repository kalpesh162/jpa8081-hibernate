package com.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Address {

	private String landMark;
	private String state;
	private String city;
	private Integer pincode;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String landMark, String state, String city, Integer pincode) {
		this.landMark = landMark;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [landMark=" + landMark + ", state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
