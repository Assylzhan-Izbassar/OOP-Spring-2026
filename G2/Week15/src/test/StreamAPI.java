package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import models.Course;
import models.Enrollment;
import models.Student;

public class StreamAPI {
	public static void main(String[] args) {
		Course c1 = new Course("OOP");
		Course c2 = new Course("ADS");
		Course c3 = new Course("Machine Learning");
		
		List<Enrollment> enrollments = new ArrayList<Enrollment>();
		
		enrollments.add(new Enrollment(
				new Student("Ulan"), c1, 92));
		enrollments.add(new Enrollment(
				new Student("Aigerim"), c3, 95));
		enrollments.add(new Enrollment(
				new Student("Katya"), c2, 95));
		enrollments.add(new Enrollment(
				new Student("Ulan"), c1, 100));
		enrollments.add(new Enrollment(
				new Student("Omar"), c2, 90));
		
		List<String> names = enrollments.stream()
				.filter(e -> e.grade >= 90)
				.limit(3)
				.distinct()
				.map(e -> e.s.name + " " + e.grade)
				.sorted()
				.collect(Collectors.toList());
		
		names.stream()
			.forEach(System.out::println);
		
//		Optional<String> result = names.stream().findFirst();
//		System.out.println(result);
		int cnt = (int) names.stream().count();
		System.out.println(cnt);
		
//		for (String s: names) {
//			System.out.println(s);
//		}
		
//		System.out.println(o);
		
		Map<Course, Optional<Enrollment>> result = enrollments.stream()
			.collect(Collectors.groupingBy(e->e.course, Collectors.maxBy(Comparator.comparingDouble(e -> e.grade))));
		
		for (Course c: result.keySet()) { 
			result.get(c).stream().map(e -> e.course.name + " " + e.s.name + " " + e.grade).forEach(System.out::println);
		}
	}
}
