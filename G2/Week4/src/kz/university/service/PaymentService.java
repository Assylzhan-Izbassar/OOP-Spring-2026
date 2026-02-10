package kz.university.service;

import java.util.List;

import kz.university.model.Person;
import kz.university.model.Teacher;

public class PaymentService {
	public void payment(List<Person> people) {
		for (Person p: people) {
			double salary = p.calcSalary();
			System.out.println("For " + p.getName() + " salary is paid: " + salary + "KZT");
		}
	}
	
	public void payment(List<Person> people, double bonus) {
		for (Person p: people) {
			double salary;
			if (p instanceof Teacher) {
				salary = ((Teacher) p).calcSalary(bonus);
			} else {
				salary = p.calcSalary();
			}
			System.out.println("For " + p.getName() + " salary is paid: " + salary + "KZT");
		}
	}
}
