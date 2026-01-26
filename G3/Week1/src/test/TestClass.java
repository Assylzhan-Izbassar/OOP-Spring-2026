package test;

import java.util.Scanner;

public class TestClass {
	public static void main(String[] args) {
		// 0. input / output
		// 1. variables / types of variables
		// 2. conditional statements 
		// 3. loop: for, while, do {} while
		// 4. function / methods
		// 5. array / vector
		// 6. solving some task in Java.
		
		Scanner scan = new Scanner(System.in);
		
		double x = Double.parseDouble(scan.nextLine());
//		scan.nextLine();
		String str = scan.nextLine();
	
		
		System.out.println("Hello, KBTU Students!");
		System.out.println(str);
		System.out.print("KBTU" + " " + x);
		
		scan.close();
	}
}
