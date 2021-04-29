package com.te.factorymethod;

import java.io.BufferedReader;
import java.util.Scanner;

public class GenerateBill {
public static void main(String[] args) {
	GetCourseFactory courseFactory = new GetCourseFactory();
	
	System.out.println("Enter the name of the course");
	Scanner sc = new Scanner(System.in);
	String courseName = sc.next();
	System.out.println("Enter the no. of course");
	int courses = Integer.parseInt(sc.next());
	
	Course c = courseFactory.getCourse(courseName);
	
	System.out.println("Course Name: "+courseName);
	c.getPrice();
	c.calculateBill(courses);
}
}
