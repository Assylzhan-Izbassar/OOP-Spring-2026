package pattern;

import model.IDelivery;
import service.DeliveryService;

public class DeliveryAdapter implements IDelivery {
	private DeliveryService ds = new DeliveryService();
	
	@Override
	public void delivery(String details) {
		ds.sendPackage(details);
	}

}
