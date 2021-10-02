package LambdaExpressionExample;

import java.util.HashMap;
import java.util.Map;

public class LambdaOverMap {
	public static void main(String[] args) {
		Map<String, String> lambdaWithMap = new HashMap<String, String>();
		lambdaWithMap.put("vivek", "bhardwaj");
		lambdaWithMap.put("ajay", "yadav");
		lambdaWithMap.put("one", "win");
		lambdaWithMap.put("two", "second");

		lambdaWithMap.forEach((k, v) -> System.out.println(k + " : " + v));

		// print the value of perticular key
		lambdaWithMap.forEach((k, v) -> {
			if (k.equals("one")) {
				System.out.println(v);
			}
		});
		
		
		//print the key of particular value
		lambdaWithMap.forEach((k,v)->{
			if(v.equals("bhardwaj")) {
				System.out.println(k);
			}
		});
	}
}
