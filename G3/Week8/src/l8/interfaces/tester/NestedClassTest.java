package l8.interfaces.tester;

import l8.interfaces.model.OuterClass;

public class NestedClassTest {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass(4, 5);
		OuterClass.InnerClass ic2 = oc.new InnerClass(6, 7);
		
		System.out.println(oc.param1);
		System.out.println(ic.param3);
		System.out.println(ic2.param3);
	}

}
