package firstTest;

import java.util.Scanner;

public class ConditionalTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade = Integer.parseInt(scan.nextLine());
		String letterGrade = "";
		
		if (grade >= 95 && grade <= 100) {
			letterGrade = "A";
		} else if (grade < 95 && grade >= 90) {
			letterGrade = "A-";
		} else if (grade < 90 && grade >= 85) {
			letterGrade = "B+";
		} else {
			letterGrade = "Some grade";
		}
		
		int y = (grade > 50) ? 10 : -1;
		
		System.out.println(letterGrade + " " + y);
		scan.close();
		
		String totalResult = "";
		
		for (int i=0; i < 100; ++i) {
			totalResult += i;
		}
		
		/*
		 * time_stamp, go_out
		 * camelCase, PascalCase
		 * 
		 * */
		
		System.out.print(totalResult);
	}

}
