package l6.logistic.model;

public class AirParcel extends Parcel {
	public AirParcel(double weight, Customer customer, String address) {
		super(weight, customer, address);
	}

	@Override
	public double calculateCost() {
		return 5.0 * this.getWeight();
	}

}
