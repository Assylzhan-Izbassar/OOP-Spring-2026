package l11.exceptions.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileInputStream fis = null;
		// result = null;
		// ... ... 
		try {
			fis = new FileInputStream(new File("src/l11/exceptions/test/test"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try {
			String line = br.readLine();
			System.out.println(line);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
