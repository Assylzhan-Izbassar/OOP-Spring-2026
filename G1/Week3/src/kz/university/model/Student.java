package kz.university.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List<Course> courses;
	
	private static int studentCnt;
	
	{
		this.courses = new ArrayList<Course>();
		studentCnt++;
		this.id = studentCnt;
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void addCourse(Course course, String enrollHash) {
		if (!enrollHash.isEmpty() && enrollHash.contains("EnrollmentService")) {
			this.courses.add(course);
		}
	}
	
	public int getID() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public List<Course> getCourses() {
		return this.courses;
	}
	
	@Override
	public String toString() {
		return this.getClass() + ": " + this.getName();
	}
}
