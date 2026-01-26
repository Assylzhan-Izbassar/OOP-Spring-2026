package firstTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class ArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Vector<String> v = new Vector<String>();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<String> arr2 = new ArrayList<String>();
		
		for (int i=0; i < 5; ++i) {
			String x = scan.nextLine();
			arr2.add(x);
		}
		
		String newString = "hello, World!";
		
		for (int i=0; i < newString.length(); ++i) {
			System.out.print(newString.charAt(i) + " ");
		}
		
		for (int i=0; i < arr2.size(); ++i) {
			System.out.print(arr2.get(i) + " ");
		}
		
		System.out.println();
		
		int[] arr = {48, 30, 10, 40};
		
		for (int i=0; i < arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		
		scan.close();

	}

}
