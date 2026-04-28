package controllers;

import config.DBContext;
import models.Course;

public class CourseController {
	public static Course addCourse(String name) {
		Course newCourse = new Course(name);
		DBContext.getInstance().addCourse(newCourse);
		DBContext.getInstance().save();
		return newCourse;
	}
}
