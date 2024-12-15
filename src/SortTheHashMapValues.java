import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class SortTheHashMapValues {

	public static void main(String[] args) {

		Map<String,Integer>hm=new HashMap<>();
		hm.put("Ten", 10);
		hm.put("Eight", 8);
		hm.put("five", 5);
		hm.put("one", 1);
		
		List<Map.Entry<String, Integer>>mapValues=new ArrayList<>(hm.entrySet());
		Collections.sort(mapValues, new Comparator<Map.Entry<String, Integer>>(){
			public int compare(Map.Entry<String, Integer> e1,Map.Entry<String, Integer> e2) {
				return e1.getValue()-e2.getValue();
			}
		});
		
		for(Map.Entry<String, Integer> e:mapValues) {
			System.out.println(e.getKey()+" : "+e.getValue());
		}
		
		hm.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}

}
