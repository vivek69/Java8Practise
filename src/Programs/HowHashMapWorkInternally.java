package Programs;

import java.util.HashMap;

public class HowHashMapWorkInternally {
public static void main(String[] args) {
	HashMap<String,Integer>hm=new HashMap<String,Integer>();
	
	hm.put("aaa", 10);
	hm.put("bbb", null);
	hm.put("ccc", null);
	hm.put(null, 13);
	hm.put(null, 14);
	
}
}
