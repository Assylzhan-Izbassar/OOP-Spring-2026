package kz.university.service;

import java.util.ArrayList;
import java.util.List;

import kz.university.model.Course;
import kz.university.model.Enrollment;
import kz.university.model.Student;

public class EnrollmentService {
	private List<Enrollment> enrollments;

	{
		this.enrollments = new ArrayList<Enrollment>();
	}
	
	public void enroll(Student s, Course c) {
//		s.addCourse(c, this.getClass().toString());
		Enrollment e = new Enrollment(s, c);
		this.enrollments.add(e);
	}
	
	public void putMark(Student s, Course c, double grade) {
		for (Enrollment e: enrollments) {
//			System.out.print(e);
			if (e.getStud().equals(s) && e.getCourse().equals(c)) {
				e.addMark(grade);
//				System.out.println(s + " added " + grade + " to course " + c);
			}
		}
	}
	
	public List<Double> getGrades(Student s, Course c) {
		for (Enrollment e: this.enrollments) {
			if (e.getStud().equals(s) && e.getCourse().equals(c)) {
				return e.getSemesterGrade();
			}
		}
		return null;
	}
	
	public void printCourses(Student s) {
		System.out.println(s);
		for (Enrollment e: this.enrollments) {
			if (e.getStud().equals(s)) {
				System.out.println(e.getCourse());
			}
		}
	}
	
	public Double getStudentFinalMark(Student s, Course c) {
		for (Enrollment e: this.enrollments) {
			if (e.getStud().equals(s) && e.getCourse().equals(c)) {
				return e.getFinalGrade();
			}
		}
		return 0.0;
	}
	
	public List<Enrollment> getEnrollments() {
		return this.enrollments;
	}
}
