package l6.logistics.model;

public class ShippingFeature {
	private String name;
	private double addedCost;
	
	public ShippingFeature(String name, double addedCost) {
		this.name = name;
		this.addedCost = addedCost;
	}

	public String getName() {
		return name;
	}

	public double getAddedCost() {
		return addedCost;
	}
	
	@Override
	public String toString() {
		return "ShippingFeature: " + this.name;
	}
}
