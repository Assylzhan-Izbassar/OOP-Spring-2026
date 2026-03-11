package l8.interfaces.model;

public class OuterClass {
	public int param1;
	int param2;
	
	public class InnerClass {
		public int param3;
		int param4;
		
		public InnerClass(int p3, int p4) {
			this.param3 = p3;
			this.param4 = p4;
		}
	}
}
