package com.Order.demo;

public class Order {
 private double totalAmount;
 private int orderDate;
 
 public Order() {
	 
 }
  public Order(double totalAmount,int orderDate) {
	  super();
	  this.totalAmount=totalAmount;
	  this.orderDate=orderDate;
  }
public double getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}
public int getOrderDate() {
	return orderDate;
}
public void setOrderDate(int orderDate) {
	this.orderDate = orderDate;
}

}
