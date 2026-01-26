package test;

public class BinarySearchPros {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 6, 7, 12};
		int target = 7;
		int result = -1;
		
		int l = 0;
		int r = arr.length;
		
		while (l < r) {
			int mid = l + (r - l) / 2;
			
			if (arr[mid] == target) {
				result = mid;
				break;
			} else if (arr[mid] > target) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		
		System.out.println(result);
	}

}
