package kz.university.app;

import java.time.LocalDate;

import kz.university.model.Course;
import kz.university.model.Student;
import kz.university.service.EnrollmentService;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("Aslan");
		Student s2 = new Student("Dina");
		
		Course c1 = new Course("OOP");
		Course c2 = new Course("ADS");
		Course c3 = new Course("Database");
		
		EnrollmentService service = new EnrollmentService();
		
		service.enroll(s1, c1);
		service.enroll(s1, c2);
		service.enroll(s2, c2);
		service.enroll(s2, c3);
		
		service.assignGrade(s1, c1, 50);
		service.assignGrade(s1, c1, 70);
		service.assignGrade(s1, c1, 90);
		
		service.assignGrade(s2, c3, 80);
		service.assignGrade(s2, c2, 70);
		service.assignGrade(s2, c3, 90);
		
		service.printCourse(s1);
		service.printCourse(s2);
//		service.showGrades(s1, c1);
		
		service.addAttendance(s2, c3, LocalDate.now());
//		service.addAttendance(s2, c3, LocalDate.now());
		
		service.showAttendance(s2, c3);

	}

}
