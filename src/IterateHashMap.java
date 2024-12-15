import java.util.*;
import java.util.Map;

public class IterateHashMap {

	public static void main(String[] args) {
		Map<String,Integer>hm=new HashMap<>();
		hm.put("Ten", 10);
		hm.put("Eight", 8);
		hm.put("five", 5);
		hm.put("one", 1);
		
		Set<Map.Entry<String, Integer>>hset=hm.entrySet();
		
		for(Map.Entry<String, Integer>val:hset) {
			
			System.err.println(val.getKey()+" : "+val.getValue());
			
		}
		
		hm.forEach((k,v)->{System.out.println(k+""+v);});
		System.out.println("print values");
		hm.forEach((k,v)->{if(v>5) {
		System.out.println(k+"  "+v);	
		}});
		

	}

}
