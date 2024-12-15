
public class SwapTwoNumbers {
public static void main(String[] args) {
	int a=8;
	int b=12;
	/*
	 * int temp=a; a=b; b=temp;
	 */
	a=a+b;
	b=a-b;
	a=a-b;
	
			System.out.println(a+ " -- " +b);
}
}
