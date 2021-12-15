package Convert;

import java.util.Collection;
import java.util.HashMap;

public class HashMapToArrayList {
public static void main(String[] args) {
	HashMap<String,String>hm=new HashMap<String,String>();
	hm.put("Vivek", "BHardwaj");
	hm.put("James", "Bond");
	hm.put("Kelvin", "klon");
	hm.put("Bahadur", "Nepali");
	
	Collection<String>values=hm.values();
	String[]ar=values.toArray(new String[values.size()]);
	for(String avalue:ar) {
		System.out.println(avalue);
	}
}
}
