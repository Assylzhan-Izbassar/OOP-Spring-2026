package kz.university.model;

public class Admin extends Person {
	private int workDays;
	private double daySalary;
	
	{
		this.workDays = 22;
		this.daySalary = 10000;
	}

	public Admin(String name) {
		super(name);
	}

	public int getWorkDays() {
		return workDays;
	}

	public void setWorkDays(int workDays) {
		this.workDays = workDays;
	}
	
	@Override
	public double calcSalary() {
		return this.daySalary * this.workDays; 
	}
	
	public double calcSalary(double bonus) {
		return this.calcSalary() + bonus; 
	}

}
