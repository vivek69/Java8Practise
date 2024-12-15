package Test;

public class Pyramid {
public static void main(String[] args) {

	for(int j=4;j>1;j--) {
		for(int l=1;l<=j;l++) {
		System.out.print(" ");
		}
		
		for(int i=1;i<6;i++) {
			for(int m=1;m<=i;m++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	System.out.println();
}

	
}
}
