package Patterns;

public class PyramidThree {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//		*****
//		****
//		***
//		**
//		*
		int givenNumber=5;
		for(int i=1;i<=givenNumber;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int k=0;k<=givenNumber;k++) {
			for(int l=givenNumber;l>=k;l--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
