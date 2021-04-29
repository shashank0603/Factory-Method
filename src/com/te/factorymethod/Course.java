package com.te.factorymethod;

public abstract class Course {
 double price;
 abstract void getPrice();
 
 public void calculateBill(int courses) {
	 System.out.println(courses*price);
 }

}
