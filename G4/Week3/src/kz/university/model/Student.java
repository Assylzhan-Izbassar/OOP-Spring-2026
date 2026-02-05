package kz.university.model;

//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;

public class Student {
	private String name;
	private int id;
	private static int studentCnt;
//	private List<Course> courses;
//	private HashMap<Course, ArrayList<Double>> grades;
	
	{
		studentCnt++;
		this.id = studentCnt;
//		this.courses = new ArrayList<Course>();
	}
	
	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

//	public List<Course> getCourses() {
//		return courses;
//	}
//	
//	public void addCourse(Course c, String hash) {
//		if (hash.contains("EnrollmentService")) {
//			this.courses.add(c);
//		}
//	}
	
//	public void addMark(Course c) {
//		// adding mark
//	}
//	public void updateMark(Course c) {
//		// logic
//	}
	
	@Override
	public String toString() {
		return this.getName();
	}
}
