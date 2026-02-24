package l6.logistics.model;

public class DroneParcel extends Parcel {

	public DroneParcel(Customer customer, String address, double weight) {
		super(customer, address, weight);
		
		if (weight > 5) {
			throw new IllegalArgumentException(
					"Drone cannot handle this weight");
		}
	}

	@Override
	public double calculateCost() {
		return 2.5 * this.getWeight();
	}

}
