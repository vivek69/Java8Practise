package ArrayProgramPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortA1ByA2 {

	public static void main(String[] args) {
	int	a[] = {1, 2, 2, 5, 7, 1, 9, 3, 6, 8, 8};
	int	b[] = {2, 1, 8, 3};
	List<Integer>allvalue=new ArrayList<>();
	int k=0;
	for(int i=0;i<b.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(b[i]==a[j]) {
				allvalue.add(a[j]);
				k=j;
			}
		}
		}
	
	System.out.println(allvalue);
	ArrayList<Integer>notinarray=new ArrayList<>();
	for(int l=0;l<a.length;l++) {
			
		
		if(!allvalue.contains(a[l])) {
			notinarray.add(a[l]);
		}
	
		}
	Collections.sort(notinarray);
	allvalue.addAll(notinarray);
	System.out.println(allvalue);
		
	}



}
