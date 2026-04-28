package test;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
	public static void main(String[] args) {
		Student s1 = new Student("A");
		Student s2 = new Student("B");
		Student s3 = new Student("C");
		
		Enrollment e1 = new Enrollment(s1, 100);
		Enrollment e2 = new Enrollment(s2, 80);
		Enrollment e3 = new Enrollment(s3, 86);
		
		List<Enrollment> enrollments = new ArrayList<Enrollment>();
		enrollments.add(e1);
		enrollments.add(e2);
		enrollments.add(e3);
		
		enrollments.stream()
			.filter(e -> e.grade > 80)
			.distinct()
			.map(e -> e.grade)
			.limit(1)
			.forEach(System.out::println);
		
	}

}
