package l11.exceptions.model;

public class Rational {
	double num;
	double denum;
	
	public Rational(double num, double denum) {
		this.num = num;
		this.denum = denum;
	}
	
	public Rational divide(Rational b) throws ArithmeticException {
		double num = this.num * b.denum;
		double denum = this.denum * b.num;
		
		if (denum == 0.0) {
			throw new ArithmeticException("Try to divide by zero!");
		}
		
		return new Rational(num, denum);
	}
	
	private Double getValue() {
		return this.num / this.denum;
	}
	
	@Override
	public String toString() {
		return this.getValue() + "";
	}
}
