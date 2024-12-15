package Programs;
/*
 * Input:
N = 5
arr[] = {0,0,0,1,1}
Output: 3
Explanation: index 3 is the transition 
point where 1 begins.

Example 2:

Input:
N = 4
arr[] = {0,0,0,0}
Output: -1
Explanation: Since, there is no "1",
the answer is -1.

Your Task:
You don't need to read input or print anything. The task is to complete the function transitionPoint() that takes array and N as input parameters and returns the 0 based index of the position where "0" ends and "1" begins. If array does not have any 1s, return -1. If array does not have any 0s, return 0.
 */

import java.util.HashSet;

public class FindTransitionPoint {

	    int transitionPoint(int arr[], int n) {
	        // code here
	       HashSet<Integer>hm=new HashSet<Integer>();
	       int position=0;
	       int returnvalue=0;
	        for(int i=0;i<n;i++){
	        	hm.add(arr[i]);
	            if(arr[i]==0 && hm.contains(0)){
	                position=i+1;
	            }
	           
	        }
	        boolean oneflag=false;
	        for(int i=0;i<n;i++){
	            if(arr[i]==1){
	                oneflag=true;
	                break;
	                
	            }
	           
	        }
	        
	         boolean zeroflag=false;
	        for(int i=0;i<n;i++){
	            if(arr[i]==0){
	                zeroflag=true;
	                break;
	            }
	           
	        }
	        
	    if(position!=0 && position<n && arr[position]==1){
	            returnvalue= position;
	        }else if(!oneflag){
	            returnvalue= -1;
	        }else if(!zeroflag){
	            returnvalue= 0;
	        }
	        
	        return returnvalue;
	    }
	    
	    public static void main(String[] args) {
	    	FindTransitionPoint fp=new FindTransitionPoint();
	    	int[] arr={1,1,1,1};
	    	System.out.println(fp.transitionPoint(arr, 4));
		}
	}

