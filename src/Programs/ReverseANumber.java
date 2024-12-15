package Programs;

public class ReverseANumber {
public static void main(String[] args) {
	int num=1234567;
	int out=0;
	while(num%10 != 0) {
		out=out*10+num%10;
		num=num/10;
	}
	System.out.println(out);
}
}
