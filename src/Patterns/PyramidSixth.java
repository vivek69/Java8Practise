package Patterns;

//       * 
//      * * 
//     * * * 
//    * * * * 
//   * * * * * 

public class PyramidSixth {
	public static void main(String[] args) {
		int givenNumber=5;
	
		/*for(int i=1;i<=givenNumber;i++) {
			for(int j=i;j<=givenNumber;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}*/
		for(int i=1;i<=givenNumber;i++) {
			for(int j=givenNumber;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			for(int l=2;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
