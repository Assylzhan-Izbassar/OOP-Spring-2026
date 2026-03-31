package l11.exceptions.test;

import l11.exceptions.model.Rational;

public class RationalTest {

	public static void main(String[] args) {
		Rational r1 = new Rational(0.0, -12.0);
		Rational r2 = new Rational(5.0, -10.0);
		
		// 20 / 80 -> 1 / 4
		// 4 * 8 / 10 * 5 -> 16 / 25;
		try {
			System.out.println(r1.multiply(r2));
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}
		try {
			System.out.println(r1.divide(r2));
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}

	}

}
