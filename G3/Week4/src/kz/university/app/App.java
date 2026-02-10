package kz.university.app;

import java.util.ArrayList;
import java.util.List;

import kz.university.model.Person;
import kz.university.model.Student;
import kz.university.model.Teacher;
import kz.university.service.PaymentService;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Almas");
		Student s1 = new Student("Alisa", "IS");
		
		// Polymorphism
		Person s2;
		s2 = new Student("Ulan", "AC");
//		s2 = new Person("Ulan");
		
		Person t1 = new Teacher("Tima", 20);
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(s1);
		people.add(s2);
		people.add(t1);
		
		PaymentService ps = new PaymentService();
//		ps.payment(people);
		ps.payment(people, 50000);
		
		// when we have inheritance, then the subclasses are
		// threaded as superclass. It means, superclass can have
		// multiple forms.
		
//		
//		for (Person p: people) {
//			if (p instanceof Student) {
//				((Student) p).introduce(3);
//			} else {
//				p.introduce();				
//			}
//		}
//		
//		s1.study();
//		if (s2 instanceof Student) { // type checking
//			((Student) s2).study(); // type casting
//		} else {
//			System.out.println("s2 is not a Student!");
//		}
//		
//		System.out.println(p1.getId());
//		System.out.println(s1.getId());
//		System.out.println(s2.getId());
	}

}
