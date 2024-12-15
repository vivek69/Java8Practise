
public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,6,7};
		int b[]= {2,5,8,9,11};
		int []c=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
			{
				c[k++]=a[i++];
			}else {
				c[k++]=b[j++];
			}
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
				
for(int l:c) {
	System.out.println(l);
}
	}

}
