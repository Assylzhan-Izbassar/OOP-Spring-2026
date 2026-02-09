package kz.university.model;

public class Teacher extends Person {
	private int lectureTime;
	private double baseSalaryPerHour;
	
	{
		this.baseSalaryPerHour = 7000;
	}
	
	public Teacher(String name, int lectureTime) {
		super(name);
		this.lectureTime = lectureTime;
	}

	public int getLectureTime() {
		return lectureTime;
	}

	public void setLectureTime(int lectureTime) {
		this.lectureTime = lectureTime;
	}
	
	@Override
	public double calcSalary() {
		return this.baseSalaryPerHour * this.lectureTime; 
	}
	
	public double calcSalary(double bonus) {
		return this.calcSalary() + bonus; 
	}
}
