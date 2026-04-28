package entity.models;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
	private Course course;
	private List<Student> students;
	private List<Teacher> instructors;
	
	{
		this.students = new ArrayList<>();
		this.instructors = new ArrayList<>();
	}
	
	public Enrollment(Course course) {
		this.course = course;
	}
	
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public void addTeacher(Teacher t) {
		this.addTeacher(t);
	}

	public Course getCourse() {
		return course;
	}

	public List<Teacher> getInstructors() {
		return instructors;
	}
}
