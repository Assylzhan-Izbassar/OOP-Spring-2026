package l11.exceptions.test;

import l11.exceptions.model.Rational;

public class RationalTest {

	public static void main(String[] args) {
		Rational a = new Rational(4, 5); // 0.8
		Rational b = new Rational(0, 2); // 0.5 - 0
		// 0.8 / 0.5 -> 8 / 5 -> 1.6
		
		Rational result = a.divide2(b);
		
		System.out.println(result);
	}

}
