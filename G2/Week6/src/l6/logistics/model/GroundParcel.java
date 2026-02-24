package l6.logistics.model;

public class GroundParcel extends Parcel {

	public GroundParcel(Customer customer, String address, double weight) {
		super(customer, address, weight);
	}

	@Override
	public double calculateCost() {
		return 1.5 * this.getWeight();
	}

}
