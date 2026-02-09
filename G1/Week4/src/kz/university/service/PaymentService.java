package kz.university.service;

import java.util.List;

import kz.university.model.Admin;
import kz.university.model.Person;
import kz.university.model.Teacher;

public class PaymentService {
	public void payment(List<Person> people) {
		for (Person p: people) {
			double salary = p.calcSalary();
			System.out.println("For " + p.getClass().getSimpleName() + " " + p.getName() + " paid salary " + salary);
		}
	}
	
	public void payment(List<Person> people, double bonus) {
		for (Person p: people) {
			double salary = 0.0;
			
			if (p instanceof Teacher) {
				salary = ((Teacher) p).calcSalary(bonus);
			}
			else if (p instanceof Admin) {
				salary = ((Admin) p).calcSalary(bonus);
			} else {
				salary = p.calcSalary();
			}
			
			System.out.println("For " + p.getClass().getSimpleName() + " " + p.getName() + " paid salary " + salary);
		}
	}
}
