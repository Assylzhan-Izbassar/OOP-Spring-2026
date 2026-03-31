package l11.exceptions.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import l11.exceptions.model.Rational;

public class RationalTest {

	public static void main(String[] args) {
		Rational a = new Rational(4, 5);
		// (4 / 5) / (5 / 6) -> (4 / 5) * (6 / 5) -> 24 / 25
		System.out.println(a); 
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			Double bNum = Double.parseDouble(br.readLine());
			Double bDenum = Double.parseDouble(br.readLine());
			Rational result = a.divide(new Rational(bNum, bDenum));
			System.out.println(result);
//			System.out.println(5.0 / 0);
			br.close();
		} catch (IOException io) {
			System.err.println(io.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println(ae.getMessage());
		}

	}

}
