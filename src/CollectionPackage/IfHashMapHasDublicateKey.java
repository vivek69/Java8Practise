package CollectionPackage;

import java.util.HashMap;

public class IfHashMapHasDublicateKey {

	public static void main(String[] args) {
HashMap<String,Integer>hm=new HashMap<>();
hm.put("abc", 123);
hm.put("abc", 456);
System.out.println(hm.get("abc"));
	}

}
