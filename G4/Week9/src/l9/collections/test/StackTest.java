package l9.collections.test;

import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
//		String seq = "((()()()))";
		String seq = "()()())(";
		
		Stack<String> st = new Stack<String>();
//		Queue<String> q;
//		Deque<String> dq;
		
		for (int i=0; i < seq.length(); ++i) {
			String brace = seq.charAt(i) + "";
			
			if (!st.isEmpty()) {
				String top = st.peek();
				if (top.equals("(") && brace.equals(")")) {
					st.pop();
					continue;
				}
			}
			st.push(brace);
			
		}
		
		if (st.isEmpty()) {
			System.out.println("VALID!");
		} else {
			System.out.println("INVALID!");
		}

	}

}
