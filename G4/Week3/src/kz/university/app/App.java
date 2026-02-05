package kz.university.app;

import java.time.LocalDate;

import kz.university.model.Course;
import kz.university.model.Student;
import kz.university.service.EnrollmentService;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student("Assem");
		Student s2 = new Student("Roma");
		
		Course c1 = new Course("ADS");
		Course c2 = new Course("OOP");
		Course c3 = new Course("Cypersec");
		
		EnrollmentService service = new EnrollmentService();
		
		service.enroll(s1, c1);
		service.enroll(s1, c2);
		
		service.enroll(s2, c2);
		service.enroll(s2, c3);
		
		service.putAttendance(s1, c1, LocalDate.now());
		
		service.addGrade(s1, c1, 100);
		service.addGrade(s1, c1, 90);
		service.addGrade(s1, c1, 95);
		
		service.addGrade(s2, c3, 95);
		service.addGrade(s2, c3, 80);
		
		service.printGrade(s1, c1);
		service.printGrade(s2, c3);
		
		service.printCourse(s1);
		service.printCourse(s2);
		
	}
}
