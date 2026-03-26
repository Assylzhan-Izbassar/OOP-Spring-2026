package l10.streams.test;

import java.io.File;

import l10.streams.helper.ObjectIO;
import l10.streams.model.Product;

public class SerializeTest {

	public static void main(String[] args) {
		String relPath = "src/l10/streams/file/product.txt";
		String absPath = new File(relPath).getAbsolutePath();
		
		Product p1 = new Product("Iron", 45000);
		boolean result = ObjectIO.write(p1, absPath);
		
		if (result) {
			System.out.println("The product is stored " + relPath);
		} else {
			System.out.println("There was some error!");
		}
		
		Product p2 = (Product) ObjectIO.read(absPath);
		p2.setName("Iron-v2");
		System.out.println(p1);
		System.out.println(p2);
	}

}
