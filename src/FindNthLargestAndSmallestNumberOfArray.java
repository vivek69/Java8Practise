
public class FindNthLargestAndSmallestNumberOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//3rd largest
		int []ar= {5,1,7,9,2,71,23,78,-7,-8};
		int k=2;
	/*	for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==(k-1)) {
				System.out.println(k+" largest element is "+ar[i]);
				break;
			}
		}
		for(int j:ar)
		{
			System.out.println(j);
		}
*/
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
			if(i==(k-1)) {
			System.out.println(k+" smallest element is "+ar[i]);
				break;
			}
		}
		for(int j:ar)
		{
			System.out.println(j);
		}
	}

}
