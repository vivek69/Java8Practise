package CollectionPackage;

import java.util.HashMap;

public class HAshmapWithMultipleNullValues {
	public static void main(String[] args) {
		HashMap<String,Integer>hm=new HashMap<>();
				hm.put("abc", null);
		hm.put("cdef", null);
	System.out.println(hm.get("abc"));	
	
	}
	
}
