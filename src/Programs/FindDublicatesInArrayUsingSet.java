package Programs;

import java.util.HashSet;
import java.util.Set;

public class FindDublicatesInArrayUsingSet {
public static void main(String[] args) {
	int arr[]={ 2, 5, 7, 8, 2, 3, 5, 11, 5, 2, 3, 9, 6, 9, 1 };
	Set<Integer>set=new HashSet<Integer>();
	for(int x : arr) {
		if(!set.add(x)) {
			System.out.println(x);
		}
	}
}
}
