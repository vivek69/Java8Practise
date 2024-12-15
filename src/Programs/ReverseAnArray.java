package Programs;

public class ReverseAnArray {
public static void main(String[] args) {
	int arr[]= {2,5,7,8,9,10};
	
	int i=0,j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	for(int k:arr)
	System.out.print(k+" ");
}
}
