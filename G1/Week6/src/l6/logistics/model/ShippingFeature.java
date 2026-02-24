package l6.logistics.model;

public class ShippingFeature {
	private FeatureType feature;
	private double addedCost;
	
	public ShippingFeature(FeatureType feature, double addedCost) {
		this.feature = feature;
		this.setAddedCost(addedCost);
	}

	public double getAddedCost() {
		return addedCost;
	}

	public void setAddedCost(double addedCost) {
		this.addedCost = addedCost;
	}

	public FeatureType getFeature() {
		return feature;
	}
	
	
}
