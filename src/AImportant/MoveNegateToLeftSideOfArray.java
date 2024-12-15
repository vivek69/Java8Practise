	package AImportant;

public class MoveNegateToLeftSideOfArray {

	public static void main(String[] args) {
  int arr[]= {-1,2,-3,4,5,-6,-9,3,7,-8,-5};
  int left=0;
  int right=arr.length-1;
  
  while(left<right) {
	  
	  while(arr[left]<0)left++;
	  while(arr[right]>0)right--;
	  
	  if(left>=right)break;
	  
	  int temp=arr[left];
	  arr[left]=arr[right];
	  arr[right]=temp;
  }
  for(int i :arr) {
  System.out.print(i+",");
	}
	}
}
