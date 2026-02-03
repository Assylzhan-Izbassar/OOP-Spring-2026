package kz.university.model;

//import java.util.ArrayList;
//import java.util.List;

public class Student {
	private int id;
	private String name;
	
//	private List<Course> courses;
	
	private static int studentCnt;
	
	{
		studentCnt++;
		id = studentCnt;
		
//		this.courses = new ArrayList<Course>();  
	}
	
	public Student(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	public List<Course> getCourses() {
//		return courses;
//	}
	
//	public void addCourse(Course c, String hashCode) {
//		if (hashCode.contains("EnrollmentService")) {
//			this.courses.add(c);	
//		}
//	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
