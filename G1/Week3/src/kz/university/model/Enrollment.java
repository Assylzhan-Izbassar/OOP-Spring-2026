package kz.university.model;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
	private Student stud;
	private Course course;
	private List<Double> semesterGrade;
	private double finalGrade;
	
	{
		this.semesterGrade = new ArrayList<Double>();
	}
	
	public Enrollment(Student stud, Course course) {
		this.stud = stud;
		this.course = course;
	}
	
	public Enrollment(Student stud, Course course, double finalMark) {
		this(stud, course);
		this.setFinalGrade(finalMark);
	}

	public Student getStud() {
		return this.stud;
	}

	public Course getCourse() {
		return this.course;
	}

	public double getFinalGrade() {
		return this.calcFinalGrade();
	}
	
	public void addMark(double mark) {
		this.semesterGrade.add(mark);
	}
	
	public List<Double> getSemesterGrade() {
		return this.semesterGrade;
	}
	
	public double calcFinalGrade() {
		double mean = 0.0;
		
		for (Double d: this.semesterGrade) {
			mean += d;
		}
		
		if (this.semesterGrade.isEmpty()) {
			return 0.0;
		}
		
		return mean / this.semesterGrade.size();
	}
	

	public void setFinalGrade(double finalGrade) {
		if (finalGrade > 0 && this.finalGrade != 0.0) {
			this.finalGrade = finalGrade;
		}
	}
	
	@Override
	public String toString() {
		return this.stud + " " + this.course;
	}
	
}
