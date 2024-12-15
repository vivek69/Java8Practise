package Test;

import java.util.HashSet;
import java.util.Set;

public class MatchedAndUnMatched {

	public static void main(String[] args) {
		int array1[] = { 9,4,0,1,4,2,7};
		int array2[] = { 8,3,0,1,2,2,6,5};
		
		Set<Integer>all=new HashSet<>();
		for(int i:array1) {
			all.add(i);
		}
		
		for(int k:array2) {
			if(all.add(k)) {
				System.out.println("UnMatched "+k);
			}else {
				System.out.println("Matched "+k);
			}
		}

	}

}
