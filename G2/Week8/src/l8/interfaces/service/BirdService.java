package l8.interfaces.service;

import java.util.List;

import l8.interfaces.contract.IBird;
import l8.interfaces.contract.IFlyable;

public class BirdService {
	public void doSmth(List<IBird> birds) {
		for (IBird bird: birds) {
			if (bird instanceof IFlyable) {
				((IFlyable) bird).fly();
			}
			bird.eat();
		}
	}
}
