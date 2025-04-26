package com.springboot.iconicthreads.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="addresses")
public class Address {
	
	private int doorNo;
	private String street;
	private String area;
	private String city;
	private String pinCode;
	private String state;
	
	
	public int getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", area=" + area + ", city=" + city + ", pinCode="
				+ pinCode + ", state=" + state + "]";
	}
	public Address(int doorNo, String street, String area, String city, String pinCode, String state) {
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pinCode = pinCode;
		this.state = state;
	}
	
	

}
