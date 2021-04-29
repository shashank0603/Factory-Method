package com.te.factorymethod;

public class SqlCourse extends Course {

	@Override
	void getPrice() {
		price = 10000;
	}

}
