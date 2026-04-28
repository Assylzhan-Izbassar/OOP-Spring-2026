package models;

import java.util.Objects;

public class Student {
	public String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null || !(o instanceof Student)) return false;
		Student stud = (Student) o;
		return this.name.equals(stud.name);
	}
 }
