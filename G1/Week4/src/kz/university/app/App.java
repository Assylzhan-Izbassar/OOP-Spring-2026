package kz.university.app;

import java.util.ArrayList;
import java.util.List;

import kz.university.model.Admin;
import kz.university.model.Person;
import kz.university.model.Student;
import kz.university.model.Teacher;
import kz.university.service.PaymentService;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person("Tima");
		Student s1 = new Student("Aidos");
		Person s2 = new Student("Ulan");
		Teacher t1 = new Teacher("Ivan", 15);
		Admin a1 = new Admin("Eldos");
		
		List<Person> people = new ArrayList<Person>();
		people.add(p1);
		people.add(s1);
		people.add(s2);
		people.add(t1);
		people.add(a1);
		
		PaymentService ps = new PaymentService();
		
		ps.payment(people);
		
		System.out.println();
		ps.payment(people, 50000);
		
//		Person[] people = {p1, s1, s2};
//		
//		for (Person p: people) {
//			if (p instanceof Person) {
//				p.introduce();
//			}
//			if (p instanceof Student) {
//				((Student) p).introduce("Russia");
//			}
//		}
		
//		p1.introduce();
//		s1.introduce();
		
//		p1.study();
//		s1.study();
		
//		Y yIns = new Y();
//		System.out.println(yIns.getWhich());
	}

}
