package Programs;

public class CountTheTriplets {
/*
 * N = 4
arr[] = {1, 5, 3, 2}
Output: 2
Explanation: There are 2 triplets: 
1 + 2 = 3 and 3 +2 = 5
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int arr[]= {1, 5, 3 ,2};
	      int count=0;
	        for(int k=0;k<n;k++){
	         for(int j=k+1;j<n;j++) {
	       
	            int sum=arr[k]+arr[j];
	            for(int l=0;l<n;l++){
	                if(sum==arr[l]){
	                    count++;
	                    
	                }
	            }
	        
	        
	    }

	}
	        System.out.println(count);
	}
}
