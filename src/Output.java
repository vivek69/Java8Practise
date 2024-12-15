import java.util.HashMap;
import java.util.Map;

public class Output {
public static void main(String[] args) {
	String input="Hi Iam Vivek";
	
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
	for(int i=0;i<input.length();i++) {
		if(hm.containsKey(input.charAt(i))) {
			hm.put(input.charAt(i), 1);
		}else {
			hm.put(input.charAt(i), hm.get(input.charAt(i))+1);
		}
	}
	for(Map.Entry entry : hm.m) {
		System.out.println(entry.getKey()+": "+ entry.getValue());
	}
	
}
}
