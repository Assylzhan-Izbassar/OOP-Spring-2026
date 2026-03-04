package l7.interfaces.model;

public class Phone implements Chargeable {

	@Override
	public void charge() {
		System.out.println("Phone is charging...");
		
	}

}
