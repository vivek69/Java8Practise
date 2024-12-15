package CollectionPackage;

import java.util.HashMap;

public class NullKeyInHashMap {

	public static void main(String[] args) {
HashMap<String, Integer>hm=new HashMap<>();

hm.put(null, 123);
hm.put(null, 456);
System.out.println(hm.get(null));
	}

}
