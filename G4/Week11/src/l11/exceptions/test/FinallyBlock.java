package l11.exceptions.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyBlock {

	public static void main(String[] args) throws IOException {
		Integer a = 0;
		BufferedReader br = null;
		
//		with File("", "a") as f:
//			f.write()
//			
//		try:
//			
//		except:
//	
//		finally:
		
			
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			a += 10;
			a += 5;
			Integer b = Integer.parseInt(br.readLine()); 
			a /= b;
			a *= 2;
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			br.close();
			System.out.println(a);
		}
		
		System.out.println(a);
	}

}
