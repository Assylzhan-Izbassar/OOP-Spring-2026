package l8.interfaces.model;

import l8.interfaces.contract.IBird;
import l8.interfaces.contract.IFlyable;

public class Eagle implements IBird, IFlyable {

	@Override
	public void fly() {
		System.out.println("Eagle can fly...");
	}

	@Override
	public void eat() {
		System.out.println("Eagle is eating...");
	}

}
