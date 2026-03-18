package l9.collections.test;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		String seq = ")()()";
		// ")()()"
		
		Stack<String> st = new Stack<String>();
		
		for (int i=0; i < seq.length(); ++i) {
			String elem = seq.charAt(i) + "";
			
			if (!st.isEmpty() && st.peek().equals("(") && elem.equals(")")) {
				st.pop();
				continue;
			} 
			
			st.add(elem);
		}
		
		if (st.isEmpty()) {
			System.out.println("Valid!");
		} else {
			System.out.println("Invalid!");
		}

	}

}
