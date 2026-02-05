package kz.university.model;

public class Course {
	private int id;
	private String title;
	private static int courseCnt;
	
	{
		courseCnt++;
		this.id = courseCnt;
	}
	
	public Course(String title) { 
		this.title = title; 
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String toString() {
		return "Course: " + this.getTitle();
	}
}
