package kz.university.model;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
	private Student student;
	private Course course;
	private List<Double> grades;
	private List<Attendance> attendances;
//	double finalGrade;
	
	{
		this.grades = new ArrayList<Double>();
		this.attendances = new ArrayList<Attendance>();
	}
	
	public Enrollment(Student student, Course course) {
		this.student = student;
		this.course = course;
	}
	
	public void addGrade(double grade) {
		if (grade >= 0.0 && grade <= 100.0) {
			this.grades.add(grade);
		}
	}
	
	public void addAttendance(Attendance a) {
		this.attendances.add(a);
	}
	
	public double finalGrade() {
		double result = 0.0;
		
		for (Double d: this.grades) {
			result += d;
		}
		if (this.grades.isEmpty()) {
			return 0.0;
		}
		return result / this.grades.size();
	}

	public Student getStudent() {
		return student;
	}

	public Course getCourse() {
		return course;
	}

	public List<Double> getGrades() {
		return grades;
	}

	public List<Attendance> getAttendances() {
		return attendances;
	}
}
