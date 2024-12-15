package ArrayProgramPractise;

import java.util.ArrayList;
import java.util.List;

public class SortArrayElments {
public static void main(String[] args) {
	int arr[]= {0, 2 ,1 ,2 ,0};
	List<Integer>all=new ArrayList<Integer>();
	int k=0;
	for(int i=0;i<arr.length;i++) {
		 k=arr[i];
		for(int j=i;j<arr.length;j++) {
			if(!all.contains(arr[j])) {
			if(k<=arr[j]) {
				
			}else {
				k=arr[j];
			}
		}}
		all.add(k);
	}
	System.out.println(all);
}
}
