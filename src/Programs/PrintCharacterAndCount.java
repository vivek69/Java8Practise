package Programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class PrintCharacterAndCount {
	
	public static void main(String[] args) {
		String input="hcl tech";
		HashMap<Character,Integer>store=new HashMap<>();
		for(char c:input.toCharArray()) {
			if(store.containsKey(c)) {
				store.put(c, store.get(c)+1);
			}else {
				store.put(c, 1);
			}
		}
			
		for(Character key: store.keySet()) {
			if(store.get(key)>1) {
				System.out.println(key+ "  "+store.get(key));
			}
		}
	}

}
