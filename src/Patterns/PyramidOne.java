package Patterns;

public class PyramidOne {
	
//	*
//	**
//	***
//	****
//	*****

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber=5;
		for(int i=1;i<=givenNumber;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}