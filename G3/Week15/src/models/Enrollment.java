package models;

import java.util.List;

public class Enrollment implements Comparable<Enrollment> {
	public Course course;
	public List<Teacher> teachers;
	public Student student;
	public double grade;
	
	public Enrollment(Course course, Student student) {
		this.course = course;
		this.student = student;
	}
	
	public Enrollment(Course course, Student student, double grade) {
		this.course = course;
		this.student = student;
		this.grade = grade;
	}
	
	@Override
	public int hashCode() {
		return this.student.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof Enrollment)) return false;
		Enrollment e = (Enrollment) o;
		return this.student.equals(e.student);
	}

	@Override
	public int compareTo(Enrollment o) {
		return (-1) * (int) ((int) this.grade - o.grade);
	}
	
	@Override
	public String toString() {
		return this.student.name;
	}
}
