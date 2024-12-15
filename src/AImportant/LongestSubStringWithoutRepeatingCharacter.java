package AImportant;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingCharacter {
//https://www.youtube.com/watch?v=sqxer2ynS6U
	public static void main(String[] args) {

	//	String str = "abcdablsdh";
		String str = "abcbcaedbcadh";
		
		HashSet<Character> set = new HashSet<>();
		String longestOverall = "";
		String longestTillnow = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				char c = str.charAt(j);
				if (set.contains(c)) {
					break;
				}
				set.add(c);
				longestTillnow += c;
			}
			if (longestOverall.length() < longestTillnow.length()) {
				longestOverall = longestTillnow;
			}
			longestTillnow = "";
			set.clear();
		}
		System.out.println(longestOverall);
		//
		/*
		Set<Character>cset=new LinkedHashSet<>();
		int l=0;
				int r=0;
		int res=0;
		
		while(r<str.length()) {
			char ch=str.charAt(r);
			if(!cset.contains(ch)) {
				cset.add(ch);
				res=Math.max(res, cset.size());
				r++;
			}else {
			cset.remove(str.charAt(l));
			l++;
			}
			}
		System.out.println(cset.toString());
	*/
	}

}
