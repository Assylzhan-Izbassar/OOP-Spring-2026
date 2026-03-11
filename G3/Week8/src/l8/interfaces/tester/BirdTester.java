package l8.interfaces.tester;

import java.util.ArrayList;
import java.util.List;

import l8.interfaces.contract.IBird;
import l8.interfaces.model.Eagle;
import l8.interfaces.model.Ostrich;
import l8.interfaces.service.BirdService;

public class BirdTester {

	public static void main(String[] args) {
		Eagle e = new Eagle();
		Eagle e2 = new Eagle();
		Ostrich o = new Ostrich();
		Ostrich o2 = new Ostrich();
		
		List<IBird> birds = new ArrayList<IBird>();
		
		birds.add(e);
		birds.add(o);
		birds.add(e2);
		birds.add(o2);
		
		BirdService bs = new BirdService();

		bs.doSmth(birds);
	}

}
