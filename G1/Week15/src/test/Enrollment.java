package test;

import java.util.Objects;

public class Enrollment {
	public Student student;
	public double grade;
	
	public Enrollment(Student student, double grade) {
		this.student = student;
		this.grade = grade;
	}
	
	public int hashCode() {
		return Objects.hash(this.student.name);
	}
	
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || !(o instanceof Enrollment)) return false;
		Enrollment e = (Enrollment) o;
		return e.student.name.equals(this.student.name); 
	}
	
//	@Override
//	public String toString() {
//		return this.student.name;
//	}
}
