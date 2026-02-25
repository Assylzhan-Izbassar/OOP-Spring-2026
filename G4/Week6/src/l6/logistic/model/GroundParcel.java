package l6.logistic.model;

public class GroundParcel extends Parcel {
	
	public GroundParcel(double weight, Customer customer, String address) {
		super(weight, customer, address);
	}

	@Override
	public double calcShippingCost() {
		return 1.5 * this.getWeight();
	}

}
