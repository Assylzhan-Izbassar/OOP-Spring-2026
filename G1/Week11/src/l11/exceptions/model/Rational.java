package l11.exceptions.model;

public class Rational {
	double numerator;
	double denumerator;
	
	public Rational(double n, double denum) {
		this.numerator = n;
		this.denumerator = denum;
	}
	
	/*
	 * k1 = a / b
	 * k2 = c / d
	 * 
	 * k1 / k2 
	 * (a / b) / (c / d) -> (a * d) / (b * c)
	 * */
	
	public Rational divide(Rational b) throws ArithmeticException {
		double resNum = this.numerator * b.denumerator;
		double resDenum = this.denumerator * b.numerator;
		
		if (resDenum == 0.0) {
			throw new ArithmeticException("Divide by zero!");
		}
		
		return new Rational(resNum, resDenum);
	}
	
	public Rational divide2(Rational b) {
		double resNum = this.numerator * b.denumerator;
		double resDenum = this.denumerator * b.numerator;
		
		try {
			double result = resNum / resDenum;
			
			if (Double.isInfinite(result)) {
				throw new ArithmeticException("Divide by zero!");
			}
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
			
			resNum = this.numerator; 
			resDenum = this.denumerator;
		}
		
		return new Rational(resNum, resDenum);
	}
	
	public double getVal() {
		return this.numerator / this.denumerator;
	}
	
	@Override
	public String toString() {
		return this.getVal() + "";
	}
	
}
