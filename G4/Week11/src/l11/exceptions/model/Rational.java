package l11.exceptions.model;

public class Rational {
	public double num;
	public double denum;
	
	public Rational(double num, double denum) throws ArithmeticException {
		this.num = num;
		
		if (denum == 0.0) {
			throw new ArithmeticException("CONSTRUCTOR: The denum is zero!");
		}
		this.denum = denum;
	}
	
	public Rational multiply(Rational b) throws ArithmeticException {
		double num = this.num * b.num;
		double denum = this.denum * b.denum;
		
		if (denum == 0.0) {
			throw new ArithmeticException("MULTIPLY: The denum is zero!");
		}
		
		return new Rational(num, denum);
	}
	private double getValue() {
		return this.num / this.denum;
	}
	
	public String toString() {
		return this.getValue() + "";
	}
}
