package Programs;

public class MoveAllZeroAtTheEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {5,0,1,0,0,2,3,4,0,5,6};
		moveZero(a);

	}
public static void moveZero(int []a) {
	int count=0;
	for(int k=0;k<a.length;k++) {
		if(a[k]!=0) {
			
			a[count++]=a[k];
		}
	}
	while(count<a.length) {
		a[count]=0;
		count++;
	}
	for (int i : a) {
		System.out.print(i);	
	}
	
}
}
