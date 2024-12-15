package Programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;



public class FindDublicatesAndStoredInSortedArrayList {
	//will print the arraylist contians only dublicates in sorted order and if no dublicates , it willprint -1

	 public static ArrayList<Integer> duplicates(int arr[], int n) {
	        // code here
	        ArrayList<Integer>finalvalue=new ArrayList<Integer>();
	       HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
	        for(int i=0;i<(n);i++){
	            if(!(hm.containsKey(arr[i]))){
	                hm.put(arr[i],1);
	            }else{
	                hm.put(arr[i],hm.get(arr[i])+1);
	            }
	        }
	        for(int k: hm.keySet()){
	        	//System.out.print("K "+k);
	            if(hm.get(k)>1){
	                finalvalue.add(k);
	            }
	        }
	        if(finalvalue.isEmpty()){
	        finalvalue.add(-1);
	        }
	        Collections.sort(finalvalue);
	        return finalvalue;
	    }
public static void main(String[] args) {
	int arr[]= {14,7,14,6,1,11,3,16,16,8,7,4,11,15,17,6,1,13};
System.out.println(FindDublicatesAndStoredInSortedArrayList.duplicates(arr, 18));
}
}
