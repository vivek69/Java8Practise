package Test;

import java.util.HashMap;
import java.util.Map;

public class PrintNumberOfLetteres {
public static void main(String[] args) {
	String input="vivek";
	Map<Character,Integer>all=new HashMap<>();
	
	for(int i=0;i<=input.length();i++) {
		if(!all.containsKey(input.charAt(i))) {
			all.put(input.charAt(i), 1);
		}else {
			all.put(input.charAt(i), all.get(input.charAt(i))+1);
		}
	}
	
	for(Character ch:all.keySet()) {
		System.out.println(ch+":"+all.get(ch));
	}
	
}
}
