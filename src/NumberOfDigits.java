import java.util.Scanner;

public class NumberOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number ");
	int number=sc.nextInt();
	int i=0;
	while(number!=0) {
		number=number/10;
		i++;
	}
	System.out.println("Numbers of digit  "+i);
	
}
}
