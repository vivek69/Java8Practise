package Patterns;

public class PyramidTwo {
//	*****
//	****
//	***
//	**
//	*
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber=5;
		for(int i=1;i<=givenNumber;i++) {
			for(int j=givenNumber;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
