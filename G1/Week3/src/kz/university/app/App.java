package kz.university.app;

import kz.university.model.Course;
import kz.university.model.Student;
import kz.university.service.EnrollmentService;

public class App {
	public static void main(String[] args) { 
		Student s1 = new Student("Azat");
		
		Course c1 = new Course("OOP");
		Course c2 = new Course("ADS");
		Course c3 = new Course("Database");
		Course c4 = new Course("PP1");
		
		EnrollmentService e = new EnrollmentService();
		
		e.enroll(s1, c1);
		e.enroll(s1, c2);
		e.enroll(s1, c3);
		
		s1.addCourse(c4, "");
		
		e.printCourses(s1);
		
		e.putMark(s1, c2, 100);
		e.putMark(s1, c2, 80);
		e.putMark(s1, c2, 70);
		
//		for (Double d: e.getGrades(s1, c2)) {
//			System.out.println(d);
//		}
		
		System.out.print(e.getStudentFinalMark(s1, c2));
	}
}
