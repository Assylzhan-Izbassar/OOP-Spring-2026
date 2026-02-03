package kz.university.model;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
	private Student s;
	private Course c;
	private List<Double> semesterGrades;
	private List<Attendance> attendances;
	
	{
		this.semesterGrades = new ArrayList<Double>();
		this.attendances = new ArrayList<Attendance>();
	}
	
	public Enrollment(Student s, Course c) {
		this.s = s;
		this.c = c;
	}
	
	public void addMark(double grade) {
		if (grade >= 0.0 && grade <= 100) {
			this.semesterGrades.add(grade);	
		}
	}
	
	public void addAttendance(Attendance att) {
		this.attendances.add(att);
	}
	
	private double calcFinalGrade() {
		double result = 0;
		for (Double d: semesterGrades) {
			result += d;
		}
		if (this.semesterGrades.isEmpty()) {
			return 0.0;
		}
		return result / this.semesterGrades.size();
	}

	public Student getS() {
		return s;
	}

	public Course getC() {
		return c;
	}

	public double getFinalGrade() {
		return this.calcFinalGrade();
	}

	public List<Attendance> getAttendances() {
		return attendances;
	}
}
