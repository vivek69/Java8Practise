import java.util.Scanner;

public class LargestOFThreeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number ");
	int a=sc.nextInt();
	System.out.println("Enter the second number");
	int b=sc.nextInt();
	System.out.println("Enter the third number");
	int c=sc.nextInt();
	
	int larger=a>b?a:b;
	int largest=c>larger?c:larger;
	
	System.out.println("largest value "+largest);
	
}
}
