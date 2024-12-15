import java.util.HashMap;
/*An anagram of a string is another string that contains the same characters, 
 * only the order of characters can be different
 */
public class AnagramStrings {
public static void main(String[] args) {
	String s1="keep";
	String s2="peek";
	String first=s1.replaceAll("\\s", "").toLowerCase();
	String second=s2.replaceAll("\\s","").toLowerCase();
	HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
		for(int i=0;i<first.length();i++) {
			if(hm.containsKey(first.charAt(i))) {
				hm.put(first.charAt(i), hm.get(first.charAt(i))+1);
			}else {
				hm.put(first.charAt(i), 1);
			}
			
		}
		HashMap<Character,Integer>hmagin=new HashMap<Character,Integer>();
		for(int i=0;i<second.length();i++) {
			if(hmagin.containsKey(second.charAt(i))) {
				hmagin.put(second.charAt(i), hmagin.get(second.charAt(i))+1);
			}else {
				hmagin.put(second.charAt(i), 1);
			}
			
		}
		
		if(hm.equals(hmagin)) {
			System.out.println("Anagram strings");
		}else {
			System.out.println("Not anagram");
		}
	}
}
