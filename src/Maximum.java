
public class Maximum {
public static void main(String[] args) {
	int[] arr={5,7,8,12};
	int max=0;
	for(int a:arr) {
		if(a>max) {
			max=a;
		}
	}
	System.out.println(max);
}
}
