package StringProgramPractise;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDublicatesFromString {
public static void main(String[] args) {
	Scanner si=new Scanner(System.in);
	System.out.println("Enter a string== ");
	String S=si.nextLine();
	si.close();
	  HashSet<Character>value=new HashSet<Character>();
      String finalvalue="";
      for(int i=0;i<S.length();i++){
          if(value.add(S.charAt(i)))
          {
              finalvalue=finalvalue+S.charAt(i);
          }
      }
     System.out.println(finalvalue);
}
}
