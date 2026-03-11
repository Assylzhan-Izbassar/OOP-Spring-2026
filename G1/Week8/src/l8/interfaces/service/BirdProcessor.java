package l8.interfaces.service;

import java.util.ArrayList;
import java.util.List;

import l8.interfaces.contract.IBird;
import l8.interfaces.contract.IFlyable;

public class BirdProcessor {
	public void fly(ArrayList<IBird> birds) {
		for (IBird b: birds) {
			if (b instanceof IFlyable) {
				IFlyable f = (IFlyable) b;
				f.fly();
			}
		}
	}
	
	public void fly(List<IFlyable> birds) {
		for (IFlyable b: birds) {
			b.fly();
		}
	}
	
	public void eat(List<IBird> birds) {
		for (IBird b: birds) {
			b.eat();
		}
	}
}
