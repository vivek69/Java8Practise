package Patterns;

public class PyramidFourth {

//	    *
//	   **
//	  ***
//	 ****
//	*****
	public static void main(String[] args) {
		int givenNumber=5;
		for(int i=1;i<=givenNumber;i++) {
			for(int k=givenNumber;k>i;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
