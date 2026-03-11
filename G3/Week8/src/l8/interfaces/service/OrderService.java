package l8.interfaces.service;

import l8.interfaces.contract.IEmailProvider;

public class OrderService {
	private IEmailProvider provider;
	
	public OrderService(IEmailProvider provider) {
		this.setProvider(provider);
	}

	public IEmailProvider getProvider() {
		return provider;
	}

	public void setProvider(IEmailProvider provider) {
		if (provider != null) {			
			this.provider = provider;
		}
	}
	
	public void completeOrder(String email) {
		// ... Payment API
		this.provider.send(
				email, 
				"Thank you for ordering! You order will come soon!"
				);
	}
}
