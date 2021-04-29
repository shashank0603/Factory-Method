package com.te.factorymethod;

public class GetCourseFactory {
	public Course getCourse(String CourseType) {
		if (CourseType == null) {
			return null;
		}
		if (CourseType.equalsIgnoreCase("Java")) {
			return new JavaCourse();
		} else if (CourseType.equalsIgnoreCase("Sql")) {
			return new SqlCourse();
		} else if (CourseType.equalsIgnoreCase("Combo")) {
			return new Combo();
		}
		return null;
	}
}
