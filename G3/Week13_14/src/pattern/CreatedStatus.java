package pattern;

import model.Order;

public class CreatedStatus implements OrderState {

	@Override
	public void next(Order context) {
		context.setStatus(new PaidStatus());
	}

	@Override
	public String getStatus() {
		return "Created";
	}

}
