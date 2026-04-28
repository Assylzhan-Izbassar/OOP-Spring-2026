package tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import models.Course;
import models.Enrollment;
import models.Student;

public class StreamTest {

	public static void main(String[] args) {
		Course c1 = new Course("OOP");
		Course c2 = new Course("ADS");
		
		List<Enrollment> enrollments = new ArrayList<Enrollment>();
		
		enrollments.add(new Enrollment(c1, new Student("Talgat"), 91));
		enrollments.add(new Enrollment(c1, new Student("Aslan"), 84));
		enrollments.add(new Enrollment(c2, new Student("Asiya"), 87));
		enrollments.add(new Enrollment(c1, new Student("Aslan"), 100));
		
		List<String> result = enrollments.stream()
			.distinct()
			.sorted()
			.filter(e -> e.grade > 85)
			.map(e -> e.student.name + " " + e.grade)
			.collect(Collectors.toList());
//			.forEach(System.out::println);
		
		result.stream().forEach(System.out::println);
		
		double avg = enrollments.stream()
							.distinct()
							.mapToDouble(e -> e.grade)
							.average()
							.orElse(0);
		System.out.println("Avg. grade: " + avg);
		
		Map<Object, Long> data = enrollments.stream()
				.distinct()
				.collect(Collectors.groupingBy(e -> e.course, Collectors.counting()));
		
		for (Object key: data.keySet()) {
			System.out.println(key + " " + data.get(key));
		}
		
		Map<Course, Optional<Enrollment>> top = enrollments.stream()
				.distinct()
				.collect(Collectors.groupingBy(
						e -> e.course,
						Collectors.maxBy(Comparator.comparingDouble(e -> e.grade))
						));
		
		for (Course key: top.keySet()) {
			System.out.println(key + " " + top.get(key));
		}
				
	}

}
