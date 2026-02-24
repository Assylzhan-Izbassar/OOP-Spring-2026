package l6.logistics.model;

public class DroneParcel extends Parcel {
	
//	{
//		limitWeight = 5.0;
//	}

	public DroneParcel(double weight) {
		super(weight);
		
		if (weight > 5.0 ) { 
			throw new IllegalArgumentException(
					"The drone cannot handle this!"
					);
		}
	}

	@Override
	public double calculateCost() {
		return this.weigth * 10.0;
	}
}
