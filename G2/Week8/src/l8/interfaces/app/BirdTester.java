package l8.interfaces.app;

import java.util.ArrayList;
import java.util.List;

import l8.interfaces.contract.IBird;
import l8.interfaces.model.Eagle;
import l8.interfaces.model.Ostrich;
import l8.interfaces.service.BirdService;

public class BirdTester {

	public static void main(String[] args) {
		List<IBird> birds = new ArrayList<IBird>();
		
		birds.add(new Eagle());
		birds.add(new Ostrich());
		birds.add(new Eagle());
		birds.add(new Eagle());
		birds.add(new Ostrich());
		
		BirdService bs = new BirdService();
		
		bs.doSmth(birds);
	}

}
