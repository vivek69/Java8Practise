package Programs;

public class RotatingAntiClockWiseByNCharacter {//Rotating right to left
public static void main(String[] args) {
/*	int n=2;
	String input="amazon";
	input=input.substring(n, input.length());
	for(int i=0;i<n;i++) {
	//input=input.substring(2, input.length())+input.charAt(0)+input.charAt(1);
	input=input+input.charAt(i);
	}
	System.out.println(input);
	
	*/
	String input="amazon";
	char []numbers=input.toCharArray();
	int n = 2;
    System.out.println("Given array is: ");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }
    //Left rotate the array by n times
    for(int i = 0; i < n; i++){
      int j;
      char firstElement=' ';
      //Storing the first element of the array to move to last
      firstElement = numbers[0];
      for(j = 0; j < numbers.length-1; j++){
        //Shifting the element to left by 1 on each iteration of loop
        numbers[j] = numbers[j+1];
      }
      //Adding the first element at the end of the array
      numbers[numbers.length-1] = firstElement;
    }
    System.out.println("Array after "+n+" left rotations: ");
    for(int i = 0; i< numbers.length; i++){
      System.out.print(numbers[i] + " ");
    }
	
}
}
