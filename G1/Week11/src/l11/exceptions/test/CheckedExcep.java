package l11.exceptions.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExcep {

	public static void main(String[] args) throws IOException {
		RuntimeException re;
		String relPath = "src/l11/exceptions/test/test";
		String absPath = new File(relPath).getAbsolutePath();
		
		try {
			FileInputStream fis = new FileInputStream(absPath);
			
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
