
public class FindDublicatesInArray {
public static void main(String[] args) {
	int arr[]= {2,4,1,2,3,4,8,9,10,6,8,6,10};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.print(arr[i]+",");
			}
		}
	}
}
}
