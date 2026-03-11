package l8.interfaces.model;

import l8.interfaces.contract.IBird;

public class Ostrich implements IBird {

	@Override
	public void eat() {
		System.out.println("Ostrich is eating...");
	}

}
