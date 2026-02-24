package l6.logistics.model;

public class AirParcel extends Parcel {
	
//	{
//		limitWeight = 1000;
//	}

	public AirParcel(double weight) {
		super(weight);
	}

	@Override
	public double calculateCost() {
		return this.weigth * 5.0;
	}
}
