package com.Order.demo;

public class Orderline {
	
	private int Item;
	private double price;
	private int quantity;
	private int ETA;
	
	public Orderline() {
		
	}
	public Orderline(int Item, double price, int quantity, int ETA) {
		super();
		this.Item=Item;
		this.price=price;
		this.quantity=quantity;
		this.ETA=ETA;
	}
	public int getItem() {
		return Item;
	}
	public void setItem(int item) {
		Item = item;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getETA() {
		return ETA;
	}
	public void setETA(int eTA) {
		ETA = eTA;
	}


}
