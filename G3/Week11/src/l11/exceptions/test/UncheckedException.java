package l11.exceptions.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;

public class UncheckedException {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ArithmeticException {
//		String relPath = "src/l11.exceptions.test/test.txt"; // WRONG FORMAT!
		
		String relPath = "src/l11/exceptions/test/test";
		File f = new File(relPath); 
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(f);
			byte[] data = fis.readAllBytes();
			
			String expression = new String(data);
			
			StringTokenizer st = new StringTokenizer(expression, "/");
			
			String sa = st.nextToken();
			String sb = st.nextToken();
			System.out.println(sa);
			System.out.println(sb);
			
			try {
				Double a = Double.parseDouble(sa);
				Double b = Double.parseDouble(sb);
				Double c = a / b;
				
				if (c.isInfinite()) {
					throw new ArithmeticException("Divide by zero!");
				}
			} catch (ArithmeticException ae) {
				System.err.println(ae.getMessage());
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException io) {
			System.err.println(io.getMessage());
		}  catch (Exception e) { // Good practice for handling the remaining exceptions.
			System.err.println(e.getMessage());
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("The try-catch is done!");
		}
		
		System.out.println("Done!");
	}

}
