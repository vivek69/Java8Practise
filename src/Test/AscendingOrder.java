package Test;

public class AscendingOrder {

	public static void main(String[] args) {
		int array3[] = { 8,3,0,1,2,2,6,5,9,3,2,0,7};
		
		for(int i=0;i<array3.length;i++) {
			for(int j=i+1;j<array3.length;j++) {
				if(array3[i]>array3[j]) {
					int temp=array3[i];
					array3[i]=array3[j];
					array3[j]=temp;
				}
			}
		}
		System.out.println("in ascending order");
		for(int k:array3) {
			System.out.println(k+",");
		}
		
		
		for(int l=0;l<array3.length;l++) {
			for(int m=l+1;m<array3.length;m++) {
				if(array3[l]<array3[m]) {
					int temp=array3[l];
					array3[l]=array3[m];
					array3[m]=temp;
				}
			}
		}
		System.out.println("in descending order");
		for(int p:array3)
		{
			System.out.println(p+" ,");
		}
	}

}
