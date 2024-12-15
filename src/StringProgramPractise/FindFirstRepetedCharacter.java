package StringProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class FindFirstRepetedCharacter {
public static void main(String[] args) {
	String S="geeksforgeeks";
	Map<Character,Integer>hm=new HashMap<Character,Integer>();
	for(int i=0;i<S.length();i++) {
		if(!hm.containsKey(S.charAt(i))) {
			hm.put(S.charAt(i), i+1);
		}else {
			hm.replace(S.charAt(i), hm.get(S.charAt(i)), i+1);
		}
	}
	char c=0;
	int length=0;
	for(Map.Entry<Character, Integer>hone:hm.entrySet()) {
		
		if(length<hone.getValue()) {
			length=hone.getValue();
			c=hone.getKey();
			
		}else {
			
		}
	}
	System.out.println("first repeated character "+c);
}
}
