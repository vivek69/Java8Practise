package Programs;

import java.util.HashMap;

public class MaxDifferenceBetweenTwoSameElement {
	public static int maxDistance(int arr[], int n) {
		//int []arr={3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
		
		/*
		 * 
		 * Max Distance 10
maximum distance for 2 is 11-1 = 10
maximum distance for 1 is 4-2 = 2
maximum distance for 4 is 10-5 = 5
		 */
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int k = 0;
			int m = 0;
			System.out.println(arr[i]);
			if (!hm.containsKey(arr[i])) {
				
				for (int j = 0; j < n; j++) {
					System.out.println(arr[j]);
					if (i != j && arr[i] == arr[j]) {
						k = i;
						m = j;
					}
				}
				hm.put(arr[i], m - k);
			}
			
		}

		int maxkey = 0;
		int maxValue = 0;
		for (int i : hm.keySet()) {
			if (hm.get(i) > maxValue) {
				maxValue = hm.get(i);
				maxkey = i;
			}
		}
		return maxValue;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2 };
		System.out.println("final "+MaxDifferenceBetweenTwoSameElement.maxDistance(arr, 12));
	}
}
