package l10.streams.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) {
		String relPath = "src/l10/streams/test/data.dat";
		String absPath = new File(relPath).getAbsolutePath();
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(absPath));
			double writeData = 102.5;
			dos.writeDouble(writeData);
			dos.close();
			
			DataInputStream dis = new DataInputStream(new FileInputStream(absPath));
//			byte[] data = dis.readAllBytes();
////			byte[] arrData = {data};
// 			Float dataFloat = Float.parseFloat(new String(data));
			double readData = dis.readDouble();
			System.out.println("Read data: " + readData);
			dis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
