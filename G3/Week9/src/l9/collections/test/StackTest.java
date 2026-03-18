package l9.collections.test;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		String seq1 = ")((()(())";
		// ")((()(())"
		// "()()()(())"
		
		Stack<String> st = new Stack<String>();
		
		for (int i=0; i < seq1.length(); ++i) {
			String temp = seq1.charAt(i) + "";
			if (!st.isEmpty()) {
				String top = st.peek();
				if (top.equals("(") && temp.equals(")")) {
					st.pop();
					continue;
				}
			}
			st.add(temp);
		}
		
		if (st.isEmpty()) {
			System.out.println("VALID!");
		} else {
			System.out.println("NOT VALID!");
		}
	}

}
