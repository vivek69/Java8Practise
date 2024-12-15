package Test;

public class GivenNumberPrime {

	public static void main(String[] args) {
int num=23;
int count=0;
		for(int i=1;i<=23;i++) {
			if(num%i==0) {
			count++;	
			}
		}
		if(count==2) {
			System.out.println("number is prime");
		}else {
			System.out.println("number is not prime");
		}
		
		
	}

}
