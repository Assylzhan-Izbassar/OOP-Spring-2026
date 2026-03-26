package l10.streams.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public static void main(String[] args) {
		String relPath = "src/l10/streams/test/hello.txt";
		String absPath = new File(relPath).getAbsolutePath();
		try {
			BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
			Double input = Double.parseDouble(bs.readLine());
			
			System.out.println(input);
			bs.close();
			
			BufferedReader bfr = new BufferedReader(new FileReader(absPath));
			String line = bfr.readLine();
			while (line != null) {				
				System.out.println(line);
				line = bfr.readLine();
			}
			bfr.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
