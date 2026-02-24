package l6.logistics.model;

public class AirParcel extends Parcel {
	
	public AirParcel(Customer customer, String address, double weight) {
		super(customer, address, weight);
	}

	@Override
	public double calculateCost() {
		return 5.0 * this.getWeight();
	}

}
