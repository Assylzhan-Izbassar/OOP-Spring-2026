package pattern;

import model.Order;

public interface OrderState {
	void next(Order context);
	String getStatus();
}
