import java.util.Scanner;

public class ReversesAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string   ");
		String value=sc.nextLine();
		System.out.println(value);
		String finalString="";
		
		  for(int i=value.length()-1;i>=0;i--) {
		  finalString=finalString+value.charAt(i); }
		 
		
		/*
		 * char []ar=value.toCharArray(); for(int i=ar.length-1;i>=0;i--) {
		 * finalString=finalString+ar[i]; }
		 */
		System.out.println(finalString);
		
	}

}
