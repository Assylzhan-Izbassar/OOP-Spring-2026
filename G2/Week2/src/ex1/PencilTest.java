package ex1;

public class PencilTest {

	public static void main(String[] args) {
		// declaration
		// creation
		
		Pencil p; // declaration
		
		p = new Pencil(); // creating the object;
		
//		p.length = 10;
		p.color = "black";
		p.weight = "B";
		
		Pencil p2 = new Pencil();
		p2.color = "blue";
		
		System.out.println(p.color);
		System.out.println(p2.color);
	}

}
