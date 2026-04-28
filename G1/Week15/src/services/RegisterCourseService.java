package services;

import config.DBContext;
import entity.models.Enrollment;
import entity.models.Student;

public class RegisterCourseService {
	public static boolean register(Enrollment e, Student s) {
		// validation
		e.addStudent(s);
		DBContext.save();
		
		return true;
	}
}
