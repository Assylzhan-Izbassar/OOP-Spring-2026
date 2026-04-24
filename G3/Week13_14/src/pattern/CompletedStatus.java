package pattern;

import model.Order;

public class CompletedStatus implements OrderState {

	@Override
	public void next(Order context) {
		context.setStatus(null);
	}

	@Override
	public String getStatus() {
		return "Completed";
	}

}
