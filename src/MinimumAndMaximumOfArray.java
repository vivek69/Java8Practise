
public class MinimumAndMaximumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {50,34,45,21,51,10,1,45};
int max,min;

if(arr[0]>arr[1]) {
	max=arr[0];
	min=arr[1];
}else {
	max=arr[1];
	min=arr[0];
}

for(int i=2;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}else if(arr[i]<min) {
		min=arr[i];
	}
}
System.out.println(max+"    "+min);
	}

}
