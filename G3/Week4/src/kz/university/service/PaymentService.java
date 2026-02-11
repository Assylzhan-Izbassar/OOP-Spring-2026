package kz.university.service;

import java.util.List;

import kz.university.model.Person;
import kz.university.model.Teacher;

public class PaymentService {
	public void payment(List<Person> people) {
		for (Person p: people) {
			double salary = p.calcSalary();
			
			System.out.println("For " + p.getName() + " the salary paid: " + salary + "KZT");
		}
	}
	public void payment(List<Person> people, double bonus) {
		for (Person p: people) {
			double salary;
			System.out.println(p.getClass().getName().contains("Teacher"));
			
			if (p.getClass().getName().contains("Person")) {
//			if (p instanceof Person) {
				salary = ((Teacher) p).calcSalary(bonus);
			} else {
				salary = p.calcSalary();
			}
			
			System.out.println("For " + p.getName() + " the salary paid: " + salary + "KZT");
		}
	}
}
