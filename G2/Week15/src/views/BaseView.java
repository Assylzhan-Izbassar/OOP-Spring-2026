package views;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class BaseView {
	protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void successMsg(String detail) { 
		System.out.println("SUCCESS: " + detail);
	}
}
