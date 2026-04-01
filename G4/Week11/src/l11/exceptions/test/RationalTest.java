package l11.exceptions.test;

import l11.exceptions.model.Rational;

public class RationalTest {

	public static void main(String[] args) {
		try {
			Rational a = new Rational(4, 0);
			Rational b = new Rational(6, 5);
			
			a.denum = 0.0;
			
			System.out.println(a.multiply(b));
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
		
//		Rational a = new Rational(4, 0);
//		Rational b = new Rational(6, 5);
//		
//		a.denum = 0.0;
//		
//		System.out.println(a.multiply(b));
		
		System.out.print("Done!");
	}

}
