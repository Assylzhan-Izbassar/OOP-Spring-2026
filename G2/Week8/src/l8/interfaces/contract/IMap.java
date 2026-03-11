package l8.interfaces.contract;

public interface IMap {
	void navigate(int[] coordinate);
	
	public static class Entry {
		int currX;
		int currY;
		
		public Entry(int currX, int currY) {
			this.currX = currX;
			this.currY = currY;
		}
	}
}
