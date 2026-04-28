package models;

import java.io.Serializable;

public class Course implements Serializable {
	private static final long serialVersionUID = 1L;
	public String name;
	
	public Course(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
