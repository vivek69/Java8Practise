package Programs;

import java.util.Scanner;

import sun.applet.Main;

public class CheckPalindrom {
/*	public static  int isPalindrome(String S) {
	        // code here
	        int i=0;
	        int j=S.length()-1;
	       while(i!=j){
	    	   if(j>i) {
	    	   System.out.println(S.charAt(i)+" -  "+S.charAt(j));
	           if(S.charAt(i)!=S.charAt(j)){
	               return 0;
	           }
	           i++;
	           j--;
	    	   }
	       }
	      return 1; 
	    }
	  public static void main(String[] args) {
		CheckPalindrom.isPalindrome("aba");
	}
	  
	*/  
	  //second way
	  
	  public static void main(String args[])
	    {
	        String a, b = "";
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the string you want to check:");
	        a = s.nextLine();
	        int n = a.length();
	        for(int i = n - 1; i >= 0; i--)
	        {
	            b = b + a.charAt(i);
	        }
	        if(a.equalsIgnoreCase(b))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }
	    }
	    
	    
}
