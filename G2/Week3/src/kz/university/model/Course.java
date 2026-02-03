package kz.university.model;

public class Course {
	private int id;
	private String title;
	
	double grade;
	
	private static int courseCnt;
	
	{
		courseCnt++;
		id = courseCnt;
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
	
	@Override
	public String toString() {
		return "Course: " + this.title;
	}
}
