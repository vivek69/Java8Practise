package Programs;

import java.util.HashMap;

public class PrintMinIndexChar {
	public static String printMinIndexChar(String S, String patt) {
		
		//Given a string S and another string patt. 
		//Find the character in patt that is present at the minimum index in S.
		// String s="gfitdvbpsy";
		// String t="qfbtrlodkm";
		char[] first = S.toCharArray();
		char[] second = patt.toCharArray();
		char anychar = ' ';
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < second.length; i++) {
			for (int j = 0; j < first.length; j++) {
				if (second[i] == first[j]) {
					hm.put(second[i], j);
					anychar = second[i];
					break;
				}
			}
		}

		char minkey = ' ';

		if (!hm.isEmpty()) {
			int minvalue = hm.get(anychar);
			for (char k : hm.keySet()) {
				if (hm.get(k) <= minvalue) {
					minkey = k;
					minvalue = hm.get(k);
				}
			}
			return Character.toString(minkey);
		} else {
			return "$";
		}

	}

	public static void main(String[] args) {
		String s = "qthvispqhz";
		String t = "xcxddangyx";
		System.out.println(PrintMinIndexChar.printMinIndexChar(s, t));
	}
}
