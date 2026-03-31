package l11.exceptions.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UncheckedException {

	public static void main(String[] args) {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			String a = br.readLine();
			String b = br.readLine();
			
			int c = Integer.parseInt(a) / Integer.parseInt(b);
			
			System.out.println("Result: " + c);
			
//			isr.close();
//			br.close();
		} catch (IOException io) {
			System.err.println(io.getMessage());
		} catch (NumberFormatException numE) {
			System.err.println(numE.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		} finally {
			System.out.println("Prev-Done!");
		}
		
		System.out.println("Done!");
	}

}
