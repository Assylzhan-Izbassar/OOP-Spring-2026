package l6.logistic.model;

public class DroneParcel extends Parcel {

	public DroneParcel(double weight, Customer customer, String address) {
		super(weight, customer, address);
		
		if (weight > 5) {
			throw new IllegalArgumentException(
					"Drone cannot handle more than 5 kg weight!");
		}
	}

	@Override
	public double calculateCost() {
		return 2.5 * this.getWeight();
	}

}
