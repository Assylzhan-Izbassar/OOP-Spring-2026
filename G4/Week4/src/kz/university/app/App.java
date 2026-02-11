package kz.university.app;

import java.util.ArrayList;
import java.util.List;

import kz.university.model.Person;
import kz.university.model.Spec;
import kz.university.model.Student;
import kz.university.service.PaymentService;

public class App {

	public static void main(String[] args) {
		Person p = new Person("Gani");
		Student s = new Student("Aruzhan", Spec.IS);
		
		Person p2 = new Student("Ulan", Spec.CS);
		
//		Student s2 = new Person();
		
		List<Person> people = new ArrayList<Person>();
		people.add(p);
		people.add(s);
		people.add(p2);
		
		PaymentService ps = new PaymentService();
		ps.payment(people);
		
		for (Person pTemp: people) {
			if (pTemp instanceof Student) { // type checking
				Student tempS = ((Student) pTemp); // typecasting
				tempS.study();
				tempS.introduce("Kazakh");
			} else {
				pTemp.introduce();
			}
					
			System.out.println();
		}
		
//		p.introduce();
//		System.out.println();
//		s.introduce();
//		System.out.println();
//		
//		System.out.println(s);
		
//		Y yIns = new Y();
//		
//		System.out.print(yIns.getWhich());
	}

}
