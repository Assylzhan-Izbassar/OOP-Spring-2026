package pattern;

import model.Order;

public class PaidStatus implements OrderState {

	@Override
	public void next(Order context) {
		context.setStatus(new CompletedStatus());
	}

	@Override
	public String getStatus() {
		return "Paid";
	}

}
