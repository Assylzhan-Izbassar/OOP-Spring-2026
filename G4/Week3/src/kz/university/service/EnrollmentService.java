package kz.university.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import kz.university.model.Attendance;
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
		this.enrollments.add(new Enrollment(s, c));
	}
	
	public void putAttendance(Student s, Course c, LocalDate date) {
		for (Enrollment e: this.enrollments) {
			if (e.getStudent().equals(s) && e.getCourse().equals(c)) {
				Attendance a = new Attendance(date);
				e.addAttandance(a);
				a.attend();
			}
		}
	}
	
	public void printCourse(Student s) {
		System.out.println(s);
		
		for (Enrollment e: this.enrollments) {
			if (e.getStudent().equals(s)) {
				System.out.println(e.getCourse() + " " + e.calcFinalGrade());
			}
		}
		
//		for (Course c: s.getCourses()) {
//			System.out.println(c);
//		}
	}
	
	public void addGrade(Student s, Course c, double grade) {
		for (Enrollment e: this.enrollments) {
			if (e.getStudent().equals(s) && e.getCourse().equals(c)) {
				e.addGrade(grade);
			}
		}
	}
	
	public void printGrade(Student s, Course c) {
		System.out.println(s + " " + c);
		for (Enrollment e: this.enrollments) {
			if (e.getStudent().equals(s) && e.getCourse().equals(c)) {
				System.out.println("Grades:");
				for (Double grade: e.getGrades()) {
					System.out.println(grade);
				}
				System.out.println("Attendance:");
				for (Attendance att: e.getAttendances()) {
					System.out.println(att);
				}
			}
		}
	}
}
