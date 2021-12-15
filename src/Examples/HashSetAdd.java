package Examples;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetAdd {
public static void main(String[] args) {
	HashSet<String>hm=new HashSet<>();
	System.out.println(hm.add("one"));
	System.out.println(hm.add("two"));
	System.out.println(hm.add("three"));
	System.out.println(hm.add("three"));
	
	for(String s : hm) {
		System.out.println(s);
	}
	System.out.println("Array");
	ArrayList<String>as=new ArrayList<>();
	System.out.println(as.add("one"));
	System.out.println(as.add("two"));
	System.out.println(as.add("two"));

	for(String st : as) {
		System.out.println(st);
	}
	
	HashMap<String, String>viv=new HashMap<>();
	System.out.println(viv.put("one", "onevalue"));
	System.out.println(viv.put("two", "twovalue"));
	System.out.println(viv.put("one", "valuezzone"));
}
}
