package test;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopArrayTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		for (int i=0; i < 5; ++i) {
			int x = Integer.parseInt(scan.nextLine());
			arrList.add(x);
		}
		
		for (int i=0; i < arrList.size(); ++i) {
			System.out.print(arrList.get(i) + " ");
		}
		
		for (Integer x: arrList) {
			System.out.print(x + " ");
		}
		
		
		
		scan.close();
		
		
//		int[] arr = new int[10];
//		
//		for (int i=0; i < arr.length; ++i) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
		
//		int i=0;
//		while(i < arr.length) {
//			System.out.print(arr[i] + " ");
//			i++;
//		}
	}

}
