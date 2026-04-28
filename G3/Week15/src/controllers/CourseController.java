package controllers;

import core.DBContext;
import models.Course;

public class CourseController {
	public static boolean addCourse(String name) {
		Course newCourse = new Course(name);
		DBContext.addCourse(newCourse);
		boolean result = DBContext.save();
		return result;
	}
	
	public static void listCourses() {
		DBContext.getCourses().stream().forEach(System.out::println);
	}
}
