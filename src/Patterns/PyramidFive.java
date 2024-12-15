package Patterns;

//*****
// ****
//  ***
//   **
//    *
public class PyramidFive {

	public static void main(String[] args) {
		int givenNumber=5;
		int alphabet=65;
for(int i=1;i<=givenNumber;i++) {
	

	for(int j=1;j<i;j++) {
		System.out.print(" ");
	}
	
	for(int k=givenNumber;k>=i;k--) {
	//	System.out.print("*");
		System.out.print((char)(alphabet+k));
	}
	System.out.println();
}

}
}
