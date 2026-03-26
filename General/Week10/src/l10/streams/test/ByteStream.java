package l10.streams.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStream {

	public static void main(String[] args) {
		String filePath = "src/l10/streams/test/hello.txt";
		String relativePath = new File(filePath).getAbsolutePath();
		try {
			InputStream inputStream = new FileInputStream(relativePath);
			byte[] content = inputStream.readAllBytes();
			String contentStr = new String(content);
			System.out.println(contentStr);
			
			inputStream.close();
			
			OutputStream outputStream = new FileOutputStream(relativePath);
			String message = "The file is changed!";
			outputStream.write(message.getBytes());
			outputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
