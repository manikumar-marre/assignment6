package com.Order.demo;

public class Address {
	private String restName;
	private int pin;
	private String city;
	private String country;
	
	public void RestaurantDetails1() {
		
	}
     
	public void RestaurantDetails(String restName,int pin,String city,String country) {
		this.restName=restName;
		this.pin=pin;
		this.city=city;
		this.country=country;
		
		
	}

	public String getRestName() {
		return restName;
	}

	public void setRestName(String restName) {
		this.restName = restName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
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
}
