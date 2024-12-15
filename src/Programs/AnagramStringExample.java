package Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class AnagramStringExample {
	
	  public static boolean isAnagram(String a,String b) {
	  
	  // Your code here
		  HashMap<Character,Integer>hm=new
	  HashMap<Character,Integer>();
		  HashSet<Character>hset=new
	  HashSet<Character>();
		  for(int i=0;i<a.length();i++){ //
	  if(hset.add(a.charAt(i))){

	  hm.put(a.charAt(i), 1);
	  for(int j=i+1;j<a.length();j++){ 
		  if(i!=j &&a.charAt(i)==a.charAt(j)) {
	  
	  hm.put(a.charAt(i),hm.get(a.charAt(i))+1);
	  
	  } } } } HashSet<Character>hmet=new HashSet<Character>(); boolean flag=false;
	  int count=0; for(int i=0;i<b.length();i++){ if(hmet.add(b.charAt(i))){
	  count=1; for(int j=i+1;j<b.length();j++){ if(i!=j &&
	  b.charAt(i)==b.charAt(j)) { count++; } }
	  
	  if(hm.get(b.charAt(i))==count){
	  
	  }else{ flag=true; break; } } }
	  
	  if(flag){ return false; }else {return true;} } public static void
	  main(String[] args) { System.out.println(AnagramStringExample.isAnagram("b",
	  "d")); }
	 
	
	
	 /* function to check whether two strings are
    anagram of each other */
    static boolean areAnagram(char[] str1, char[] str2)
    {
        // Get lengths of both strings
        int n1 = str1.length;
        int n2 = str2.length;

        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;

        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);

        // Compare sorted strings
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    /* Driver Code*/
    public static void main(String args[])
    {
        char str1[] = { 't', 'e', 's', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
      
        // Function Call
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
    }
}
