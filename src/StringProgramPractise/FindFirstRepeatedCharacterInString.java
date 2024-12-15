package StringProgramPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstRepeatedCharacterInString {

	public static void main(String[] args) {

		String input="eaahroidhj";
		char chvalue=' ';
		Map<Character,Integer>hm=new HashMap<>();
		for(int i=0;i<input.length();i++) {
			if(!hm.containsKey(input.charAt(i))) 
			{
				for(int j=i+1;j<input.length();j++) {
					if(input.charAt(i)==input.charAt(j)) {
						hm.put(input.charAt(i), j);
						chvalue=input.charAt(i);
						break;
					}
				}
			}
		}
		if(!hm.isEmpty()) {
		int k=hm.get(chvalue);
		char c = ' ';
		for(Character all:hm.keySet()) //ehroidhaaj
		{
			if(k>=hm.get(all)) {
				k=hm.get(all);
				c=all;
			}
		}
		System.out.println("First repeted  character "+c+" at position "+ k);}
		else {
			System.out.println("-1");
		}
	}

}
