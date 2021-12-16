package Programs;
// use hashmap to find the dublicate nummber in array
import java.util.HashMap;

public class FindDublicatesInArrayUsingHashMap {

	public static void main(String[] args) {
		int arr[] = { 2, 5, 7, 8, 2, 3, 5, 11, 5, 2, 3, 9, 6, 9, 1 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int x : arr) {
			if (!hm.containsKey(x)) {
				hm.put(x, 1);
			} else {
				hm.put(x, hm.get(x) + 1);
			}
		}
		System.out.println("Print dublicate values with HasMap");
		for(int j : hm.keySet())
		{
			if(hm.get(j)>1) {
				System.out.println(j);
			}
		}
	}

}
