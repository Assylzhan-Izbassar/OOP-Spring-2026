package kz.university.service;

import java.util.List;

import kz.university.model.Person;

public class PaymentService {
	public void payment(List<Person> people) {
		for (Person p: people) {
			double sum = p.paymentSum();
			System.out.println(p.getName() + ". Payment is completed! Total sum: " + sum + "KZT.");
		}
	}
}
