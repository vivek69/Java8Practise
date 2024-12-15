package Programs;

import java.util.HashMap;

public class ColumnWithMaximumZeroInTwoDirectionalMatrix {

	static int columnWithMaxZero(int a[][], int n) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		// Your code here

		for (int j = 0; j < n; j++) {
			hm.put(j, 0);
			for (int i = 0; i < n; i++) {
				if (j < a[i].length) {
					if (a[i][j] == 0) {
						hm.put(j, hm.get(j) + 1);
					}
				}
			}
		}

		int maxKey = 0;
		int maxValue = 0;
		for (int i : hm.keySet()) {
			if (hm.get(i) > maxValue) {
				maxKey = i;
				maxValue = hm.get(i);
			}
		}
		return maxKey;
	}

	public static void main(String[] args) {
		int[][] ar = { { 1 }, { 2 }, { 3, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		System.out.println(ColumnWithMaximumZeroInTwoDirectionalMatrix.columnWithMaxZero(ar, 4));
	}
}