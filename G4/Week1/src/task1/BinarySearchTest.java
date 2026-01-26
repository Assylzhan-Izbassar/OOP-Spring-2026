package task1;

public class BinarySearchTest {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 10, 12, 20};
		BinarySearch bs = new BinarySearch(arr);
		
		System.out.print(bs.search(25));
	}

}
