package kz.university.app;

import java.time.LocalDate;

import kz.university.model.Course;
import kz.university.model.Student;
import kz.university.service.EnrollmentService;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Ardak");
		Student s2 = new Student("Symbat");
		
		Course c1 = new Course("Database");
		Course c2 = new Course("OOP");
		Course c3 = new Course("ADS");
		
		EnrollmentService enroll = new EnrollmentService();
		
		enroll.enroll(s1, c1);
		enroll.enroll(s1, c3);
		enroll.enroll(s2, c1);
		enroll.enroll(s2, c2);
		
		enroll.assignGrade(s1, c1, 100);
		enroll.assignGrade(s1, c1, 70);
		enroll.assignGrade(s1, c1, 70);
		
		enroll.markAttendance(s1, c1, LocalDate.now());
		
		enroll.showAttendance(s1, c1);
		
		enroll.printCourse(s1);
		enroll.printCourse(s2);
	}

}
