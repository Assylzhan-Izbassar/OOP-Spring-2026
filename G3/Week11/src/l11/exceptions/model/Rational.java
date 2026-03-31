package l11.exceptions.model;

public class Rational {
	private Double num;
	private Double denum;
	
	public Rational(Double num, Double denum) {
		this.num = num;
		this.denum = denum;
	}
	
	public Rational multiply(Rational b) throws ArithmeticException {
		Double num = this.num * b.getNum();
		Double denum = this.denum * b.getDenum();
		
		if (denum == 0.0) {
			throw new ArithmeticException("Denum is zero!");
		}
		
		return new Rational(num, denum);
	}
	
	public Rational divide(Rational b) {
		return this.multiply(new Rational(b.getDenum(), b.getNum()));
	}
	
	public Double getNum() {
		return num;
	}
	public void setNum(Double num) {
		this.num = num;
	}
	public Double getDenum() {
		return denum;
	}
	public void setDenum(Double denum) {
		this.denum = denum;
	}
	
	private Double getValue() {
		return this.num / this.denum;
	}
	
	@Override 
	public String toString() {
		return this.getValue() + "";
	}
}
