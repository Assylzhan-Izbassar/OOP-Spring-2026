package l10.streams.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIO {
	public static boolean write(Object o, String filePath) {
		try {			
			ObjectOutputStream oos = new ObjectOutputStream(
					new FileOutputStream(filePath));
			oos.writeObject(o);
			oos.close();
			return true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public static Object read(String filePath) {
		try {
			ObjectInputStream ois = new ObjectInputStream(
					new FileInputStream(filePath));
			Object o = ois.readObject();
			ois.close();
			return o;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
