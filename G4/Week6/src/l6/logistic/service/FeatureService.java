package l6.logistic.service;

import java.util.List;

import l6.logistic.model.ShippingFeature;

public class FeatureService {
	public void printFeature(List<ShippingFeature> features) {
		for (ShippingFeature sf: features) {
			System.out.println(sf);
		}
	}
}
