package l6.logistics.model;

public class GroundParcel extends Parcel {
	
//	{
//		limitWeight = 5000;
//	}
	
	public GroundParcel(double weight) {
		super(weight);
	}

	@Override
	public double calculateCost() {
		return this.weigth * 1.5;
	}
}
