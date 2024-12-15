
public class PrimeNumber {
	//print 100 prime numbers
	
	//a number that can be divided exactly only by itself and 1
public static void main(String[] args) {
	for(int i=2;i<100;i++) {
		boolean flag=true;
		for(int j=2;j<i;j++) {
			if(i%j==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println(i);
		}
	}
}
	// it will check number is a prime or not
/*
	public static void main(String[] args) {
	int num=-1;
	int count=0;
	if(num>1) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime number");
		}else {
			System.out.println("not a prime");
		}
	}else {
		System.out.println("number is not prime");
	}
}
*/
}
