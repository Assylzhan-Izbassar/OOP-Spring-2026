package l11.exceptions.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		RuntimeException re;
		String relPath = "src/l11/exceptions/test/test";
		File f = new File(relPath);
		try {
			FileInputStream fis = new FileInputStream(f);
			byte[] data = fis.readAllBytes();
			System.out.println(data);
			System.out.println(new String(data));
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}

	}

}
