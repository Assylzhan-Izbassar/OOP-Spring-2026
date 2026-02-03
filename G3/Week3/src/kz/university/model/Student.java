package kz.university.model;

//import java.util.ArrayList;
//import java.util.List;

public class Student {
	private int id;
	private String name;
//	private List<Course> courses;
//	private double finalGrade;
	
	private static int studentCnt;
	
	{
		studentCnt++;
		this.id = studentCnt;
//		this.courses = new ArrayList<Course>();
	}
		
	public Student(String name) {
		this.name = name;
	}
	
//	public void addCourse(Course c, String hashCode) {
//		if (hashCode.contains("EnrollmentService")) {
//			this.courses.add(c);
//		}
//	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	public List<Course> getCourses() {
//		return courses;
//	}
	
	@Override
	public String toString() {
		return this.name;
	}

}
