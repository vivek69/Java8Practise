
public class SortArrayWithBubbleSort {
//https://www.youtube.com/watch?v=cJ2eMUiCFy4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=22
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,3,8,1,7,4,10,50,34};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int k:arr) {
			System.out.print(k+" ,");
		}

	}

}
