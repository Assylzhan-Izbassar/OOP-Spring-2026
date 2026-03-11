package l8.interfaces.service;

import l8.interfaces.contract.IEmailProvider;

public class OrderService {
	private IEmailProvider provider;
	
	public OrderService(IEmailProvider provider) {
		this.provider = provider;
	}
	
	public IEmailProvider getEmailProvider() {
		return this.provider;
	}
	
	public void setEmailProvider(IEmailProvider newProvider) {
		if (newProvider != null) {
			this.provider = newProvider;
		}
	}
	
	public boolean completeOrder(String email) {
		// .. payment API
		provider.send(email, "Thank you for your order!");
		
		return true;
	}
}
