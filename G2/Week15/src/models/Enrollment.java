package models;

import java.util.Objects;

public class Enrollment implements Comparable<Enrollment> {
	public Teacher t;
	public Course course;

	public Student s;
	public double grade;
	
	public Enrollment(Course course, Teacher teacher) {
		this.course = course;
		this.t = teacher;
	}
	
	public Enrollment(Student s, Course c, double grade) {
		this.s = s;
		this.grade = grade;
		this.course = c;
	}

	@Override
	public int compareTo(Enrollment o) {
		return (-1) * (int) ((int) this.grade - o.grade);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.s.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof Enrollment)) return false;
		
		Enrollment e = (Enrollment) o;
		return this.s.name.equals(e.s.name);
	}
}
