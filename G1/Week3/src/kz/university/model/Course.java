package kz.university.model;

public class Course {
	private int id;
	private String title;
//	private double grade; // it is breaking the entity cohesion;
	
	private static int cntCourse;
	
	{
		cntCourse++;
		this.id = cntCourse;
	}
	
	public Course(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}
	
	public String toString() {
		return this.getId() + " - " + this.getTitle();
	}
}
