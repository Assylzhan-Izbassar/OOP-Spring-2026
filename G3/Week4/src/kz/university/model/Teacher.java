package kz.university.model;

public class Teacher extends Person {
	private int lectureHours;
	private double baseHourBudget;
	
	{
		this.baseHourBudget = 5000.0;
	}

	public Teacher(String name, int lectureHours) {
		super(name);
		this.lectureHours = lectureHours;
	}
	
	@Override
	public double calcSalary() {
		return this.lectureHours * this.baseHourBudget;
	}
	
	public double calcSalary(double bonus) {
		return this.calcSalary() + bonus;
	}

}
