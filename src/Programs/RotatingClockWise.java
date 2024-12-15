package Programs;

public class RotatingClockWise {
public static void main(String[] args) {
	String input="amazon";
	char []numbers=input.toCharArray();
	int n = 2;
	for(int i = 0; i < n; i++){
	      int j;
	      char lastElement=' ';
	      //Storing the last element of the array to move to start
	      lastElement = numbers[numbers.length-1];
	      for(j = numbers.length-1; j > 0; j--){
	        //Shifting the element to right by 1 on each iteration of loop
	        numbers[j] = numbers[j-1];
	      }
	      //Adding the last element at the beginning of the array
	      numbers[0] = lastElement;
	    }
	    System.out.println();
	    //Printing output array
	    System.out.println("Array after "+n+" right rotations: ");
	    for(int i = 0; i< numbers.length; i++){
	      System.out.print(numbers[i] + " ");
	    }
	  }

}
