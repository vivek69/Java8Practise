import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int value=sc.nextInt();//1234
int finaval=0;

while(value!=0) {
	
	finaval=finaval*10+value%10;
	value=value/10;
	
}
System.out.println(finaval);

	}

}
