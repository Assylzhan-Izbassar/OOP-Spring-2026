package l10.streams.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharStream {

	public static void main(String[] args) {
		String filePath = "src/l10/streams/test/hello.txt";
		String relativePath = new File(filePath).getAbsolutePath();
		
		try {			
			FileReader fr = new FileReader(relativePath);
			BufferedReader br = new BufferedReader(fr); 
			String data = br.readLine();
			System.out.println(data);
			br.close();
			fr.close();
			
			FileWriter fw = new FileWriter(relativePath);
			PrintWriter pw = new PrintWriter(fw, true);
			String message = "Used PrintWriter to modify the data";
			pw.write(message);
			pw.close();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
