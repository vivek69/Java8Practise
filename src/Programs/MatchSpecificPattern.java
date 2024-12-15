package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MatchSpecificPattern {
	
	/*
	 * dict[] = {abb,abc,xyz,xyy}
pattern  = foo
Output: abb xyy
Explanation: xyy and abb have the same
character at index 1 and 2 like the
pattern.
	 * 
	 */
	public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pattern)
	{
	    //add code here.
	    HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	    for(int i=0;i<pattern.length();i++){
	        if(!hm.containsKey(pattern.charAt(i)))
	        {
	            hm.put(pattern.charAt(i),1);
	        }else{
	            hm.put(pattern.charAt(i),hm.get(pattern.charAt(i))+1);
	        }
	    }
	    ArrayList<String>as=new ArrayList<String>();
	    for(String input:dict){
	    	if(input.length()==pattern.length()) {
	        HashMap<Character,Integer>hmo=new HashMap<Character,Integer>();
	        for(int i=0;i<input.length();i++){
	        if(!hmo.containsKey(input.charAt(i)))
	        {
	            hmo.put(input.charAt(i),1);
	        }else{
	            hmo.put(input.charAt(i),hmo.get(input.charAt(i))+1);
	        }
	    }
	    if(new HashSet<>(hm.values()).equals(new HashSet<>(hmo.values())))
	    {
	        as.add(input);
	    }
	    	}
	    }
	   return as;
	}
	public static void main(String[] args) {
		String[] inputarray= {"abb","abc","xyz","xyy"};
		ArrayList<String>input=new ArrayList<String>(Arrays.asList(inputarray));
		System.out.println(MatchSpecificPattern.findMatchedWords(input, "foo"));
	}
}
