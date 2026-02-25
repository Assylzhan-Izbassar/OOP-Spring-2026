package l6.logistic.model;

public class DroneParcel extends Parcel {

	public DroneParcel(double weight, Customer customer, String address) {
		super(weight, customer, address);
		
		if (weight > 5) {
			throw new IllegalArgumentException(
					"Drone cannot handle the weight > 5 kg");
		}
	}

	@Override
	public double calcShippingCost() {
		return 2.0 * this.getWeight();
	}

}
