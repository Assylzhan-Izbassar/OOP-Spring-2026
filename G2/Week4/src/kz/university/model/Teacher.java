package kz.university.model;

public class Teacher extends Person {
	private double baseSalary;
	private int addWorkHours;
	private static int hourBonus = 5000;
	
	public Teacher(String name, double baseSalary) {
		super(name);
		this.baseSalary = baseSalary;
	}
	
	public double calcSalary() {
		return this.baseSalary + hourBonus * this.addWorkHours;
	}
	
	public double calcSalary(double bonus) {
		return this.calcSalary() + bonus;
	}

	public void setAddWorkHours(int addWorkHours) {
		this.addWorkHours = addWorkHours;
	}
}
