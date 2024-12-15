
public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=1634;
		int funm=num;
		int len=0;
		while(funm!=0) {
			len++;
			funm=funm/10;
		}
		
		int snum=num;
		int rem=0;
		int arm=0;
		while(snum!=0) {
			rem=snum%10;
			int mul=1;
			for(int i=1;i<=len;i++) {
				mul=mul*rem;
			}
			arm=arm+mul;
			snum=snum/10;
		}
		if(num==arm) {
			System.out.println("Number is armstrong");
		}else {
			System.out.println("Number is not armstrong");
		}
				

	}

}
